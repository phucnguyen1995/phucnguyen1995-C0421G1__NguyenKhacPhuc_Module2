package _20_controllers.models;

public class Employee extends Person {
//        Employee (nhân viên ) có thêm:
//        Trình độ,
//        Vị trí,
//        lương


    private String qualification;
    private String position;
    private double salary;


    public Employee(int code, String name, String dayOfBirth, String sex, String email, int idNumber,
                    String phoneNumber, String position, String qualification, double salary) {
        super(code, name, dayOfBirth, sex, email, idNumber, phoneNumber);
        this.position = position;
        this.qualification = qualification;
        this.salary = salary;
    }

    public Employee(String position, String qualification, double salary) {
        this.position = position;
        this.qualification = qualification;
        this.salary = salary;
    }


    public Employee() {
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "position='" + position + '\'' +
//                ", salary=" + salary +
//                ", qualification='" + qualification + '\'' +
//                ", code=" + code +
//                ", name='" + name + '\'' +
//                ", dayOfBirth='" + dayOfBirth + '\'' +
//                ", sex='" + sex + '\'' +
//                ", email='" + email + '\'' +
//                ", idNumber=" + idNumber +
//                ", phoneNumber=" + phoneNumber +
//                '}';
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
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
