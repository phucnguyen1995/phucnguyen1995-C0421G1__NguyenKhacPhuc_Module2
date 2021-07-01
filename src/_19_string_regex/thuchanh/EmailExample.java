package _19_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Viết phương thức để kiểm tra tính hợp lệ của một email.
//Một email hợp lệ cần đạt các yêu cầu sau:
//Bắt đầu bằng một ký tự
//Không chứa các ký tự đặc biệt
//Có một ký tự @ ngăn cách tên email và domain
//Domain phải hợp lệ

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
