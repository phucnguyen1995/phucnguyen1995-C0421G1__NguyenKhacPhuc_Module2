package _21_case_study.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
//Employee bao gồm: Mã nhân viên,Họ tên,   Ngày sinh, Giới tính,  Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
// Customer bao gồm:Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ


//    =>person:Mã,Họ tên,  Ngày sinh, Giới tính,  Số CMND, Số Điện Thoại, Email
//    Employee (nhân viên ) có thêm:Trình độ, Vị trí, lương
//    Custommer(khách hàng) có thêm:Loại khách, Địa chỉ

    protected int code;
    protected String name, dayOfBirth, sex, email, phoneNumber;
    protected int idNumber;

    public Person(int code, String name, String dayOfBirth, String sex,
                  String email, int idNumber, String phoneNumber) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.email = email;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
