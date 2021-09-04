package com.example.service;

import com.example.model.entity.Deal;
import com.example.model.repository.IDealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class DealServiceImpl implements IDealService {

    @Autowired
    IDealRepository iDealRepository;
    @Override
    public Page<Deal> findAll(Pageable pageable, String service, String name) {
        return iDealRepository.findAll(pageable,"%" + service + "%", "%" + name + "%");
    }

    @Override
    public Deal findById(Long id) {
        return iDealRepository.findById(id).get();
    }

    @Override
    public void save(Deal deal) {
        iDealRepository.save(deal);

    }

    @Override
    public void remove(Long id) {
        iDealRepository.deleteById(id);

    }
}
