package _19_string_regex.thuchanh;

public class Testth1 {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "phuc@gmail.com", "phuc@yahoo.com", "phuc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}

//kết quả chạy :
//Email is phuc@gmail.com is valid: true
//Email is phuc@yahoo.com is valid: true
//Email is phuc@hotmail.com is valid: true
//Email is @gmail.com is valid: false
//Email is ab@gmail. is valid: false
//Email is @#abc@gmail.com is valid: false
