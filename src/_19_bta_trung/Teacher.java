package _19_BtaTrung;

public class Teacher extends Person {
    private String level;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, String level) {
        super(id, name, age, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                "level='" + level + '\'' +
                '}';
    }
}
