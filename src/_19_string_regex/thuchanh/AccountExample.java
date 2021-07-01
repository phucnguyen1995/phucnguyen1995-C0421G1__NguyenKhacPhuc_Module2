package _19_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Mô tả
//Viết phương thức để kiểm tra tính hợp lệ của tên tài khoản.
//Một tài khoản hợp lệ cần đạt các yêu cầu sau:
//Không chứa các ký tự đặc biệt
//Ít nhất là 6 ký tự
//Không chứa các ký tự viết hoa
//Cho phép dấu gạch dưới (_)

public class AccountExample {
    /*Không chứa các ký tự đặc biệt
     Phải dài hơn 6 ký tự
     Không chứa các ký tự viết hoa
     Cho phép dấu gạch dưới (_)
   */
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
