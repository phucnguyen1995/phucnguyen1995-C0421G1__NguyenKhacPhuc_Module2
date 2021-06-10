package _06_ke_thua.baitap;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(5, 6);
        System.out.println(mv);
        mv.move();
        System.out.println(mv);

        MovablePoint mv2=new MovablePoint(2.0f,3.0f,4.0f,5.0f);
        System.out.println(mv2);
        mv2.move();
        System.out.println(mv2);
    }
}
