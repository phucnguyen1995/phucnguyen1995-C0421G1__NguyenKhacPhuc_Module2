package com.example.controller;

import com.example.dto.DealDto;
import com.example.model.entity.Customer;
import com.example.model.entity.Deal;
import com.example.service.ICustomerService;
import com.example.service.IDealService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class DealController {

    @Autowired
    IDealService iDealService;

    @Autowired
    ICustomerService iCustomerService;

    @ModelAttribute("customerList")
    public List<Customer> customerList() {
        return iCustomerService.findAll();
    }

//luwu ý:
    @GetMapping(value = "")
    public String list(@PageableDefault(value = 2) Pageable pageable,
                       @RequestParam Optional<String> service,
                       @RequestParam Optional<String> name, Model model) {
        String keywordService = "";
        String keywordName = "";
        if (service.isPresent()) {
            keywordService = service.get();
        }
        if (name.isPresent()) {
            keywordName = name.get();
        }
        
        Page<Deal> deals = iDealService.findAll(pageable, keywordService, keywordName);

        model.addAttribute("deals", deals);
        model.addAttribute("keywordService", keywordService);
        model.addAttribute("keywordName", keywordName);
        if (deals.isEmpty()) {
            model.addAttribute("message", "List empty!");
        }
        return "/list";
    }


    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("dealDto", new DealDto());
        return "/create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute DealDto dealDto, BindingResult bindingResult, Model model,
                       RedirectAttributes redirectAttributes) {
        try {
            new DealDto().validate(dealDto, bindingResult);
            if (bindingResult.hasFieldErrors()) {
                return "/create";
            } else {
                Deal deal = new Deal();
                //     copy dữ liệu từ dto sang đối tượng entity tương ứng
                BeanUtils.copyProperties(dealDto, deal);
                iDealService.save(deal);
                redirectAttributes.addFlashAttribute("message", "New  created successfully");
                return "redirect:";
            }
        } catch (Exception e) {
            model.addAttribute("messageCode", "Code duplicated");
            model.addAttribute("dealDto", dealDto);
            return "/create";
        }
    }

    @GetMapping("/delete")
    public String showDeleteForm(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        iDealService.remove(id);
        redirectAttributes.addFlashAttribute("message", "deleted successfully");
        return "redirect:";
    }



    @PostMapping("/deletenhieu")
    public String showDeleteFormNhieu(@RequestParam Optional<List<Long>> listId, RedirectAttributes redirectAttributes) {

        if (listId.isPresent()) {
            for (Long id : listId.get()) {
                iDealService.remove(id);
            }
        }
        redirectAttributes.addFlashAttribute("message", "Delete successfully!");
        return "redirect:";

    }







    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("deal", iDealService.findById(id));
        return "/view";
    }

// sửa y chan tạo chỉ sửa 1 vài chỗ vì ta phải hiểu bản chất tạo là lấy dối tuwowngj rỗng
//    còn sửa là đối tượng đó đã có giá trị
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id,Model model) {
//        Deal deal=iDealService.findById(id);
//        DealDto dealDto=new DealDto();
////        đảo nguwocj lại:
//        BeanUtils.copyProperties(deal,dealDto);
//        model.addAttribute("dealDto", new DealDto());
//        return "/create";
//    }



    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id,Model model) {
        Deal deal=iDealService.findById(id);
        DealDto dealDto=new DealDto();
//        đảo nguwocj lại:
        BeanUtils.copyProperties(deal,dealDto);
        model.addAttribute("dealDto",dealDto);
        return "/edit";
    }





    @PostMapping("/edit")
    public String update(@Valid @ModelAttribute DealDto dealDto, BindingResult bindingResult, Model model,
                       RedirectAttributes redirectAttributes) {
        try {
            new DealDto().validate(dealDto, bindingResult);
            if (bindingResult.hasFieldErrors()) {
                return "/edit";
            } else {
                Deal deal = new Deal();
                //     copy dữ liệu từ dto sang đối tượng entity tương ứng
                BeanUtils.copyProperties(dealDto, deal);
                iDealService.save(deal);
                redirectAttributes.addFlashAttribute("message", "New  created successfully");
                return "redirect:";
            }
        } catch (Exception e) {
            model.addAttribute("messageCode", "Code duplicated");
            model.addAttribute("dealDto", dealDto);
            return "/edit";
        }
    }


}
