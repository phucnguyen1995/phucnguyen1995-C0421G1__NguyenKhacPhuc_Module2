package Nhap.controllers;

import java.util.regex.Pattern;

public class chay {
    public static void main(String[] args) {
       String a="51-X2-123.04";
       String b="5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
       String c=" 0\\d{9,10}";
//       String tuViet="\d\\d-[X]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
       boolean k=Pattern.matches(b,a);
        System.out.println(k);
        boolean e=Pattern.matches(c,a);
        System.out.println(e);

    }
}
