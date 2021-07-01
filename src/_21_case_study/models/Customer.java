package _21_case_study.models;

public class Customer extends Person {
//     Custommer(khách hàng) có thêm:
//     Loại khách
//     Địa chỉ

    private String type;
    private String address;

    public Customer(int code, String name, String dayOfBirth, String sex, String email, int idNumber, String phone, String type, String address) {
        super();
        this.type = type;
        this.address = address;
    }

    public Customer(int code, String name, String dayOfBirth, String sex, String email, int idNumber, String phone, String type, double address) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
