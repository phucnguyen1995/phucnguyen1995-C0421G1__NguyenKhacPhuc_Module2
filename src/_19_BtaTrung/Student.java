package _19_BtaTrung;

public class Student extends Person {
    private String _class;

    public Student(int id, String name, int age, String address, String _class) {
        super(id, name, age, address);
        this._class = _class;
    }

    public Student() {
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public void move() {
        System.out.println("Đi bằng xe đạp");
    }

    public void study() {

        System.out.println("Học tiếng anh");
    }

    public void study(String subject) {

        System.out.println("Học môn " + subject);
    }

//    cách vừa dấu hoặc dc tât cả vừa không cần phải thay đổi AModifile bên person thành protected DÒNG 69
    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                "_class='" + _class + '\'' +
                '}';
    }
}


//GHI CHÚ THÊM VỀ OVERRIDE:

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                "_class='" + _class + '\'' +
//                '}';
//    }
//
//    muốn hiển thị ko bị lỗi CÁC dòng trên (cách 2) ta phải khai báo bên person là protected không lai là private
//    protected int id;
//    protected String name;
//    protected int age;
//    protected String address;


//    @Override
//    public String toString() {
//        return super.toString() + "class = " + this._class;
//    }
//    cách này của hà có chút vấn đề (dâu hoặc ko bao hàm dc tất cả ) vì ham bên peson là :return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
