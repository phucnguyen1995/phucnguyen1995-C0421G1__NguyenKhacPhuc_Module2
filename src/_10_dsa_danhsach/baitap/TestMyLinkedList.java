package _10_dsa_danhsach.baitap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> animals = new MyLinkedList<>();

        // Thêm phần tử vào List
        animals.addFirst("Bò");
        animals.addFirst("Mèo");
        animals.addLast("Gà");
        animals.add(1, "Chó");

        // Hiển thị
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }

        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());

        // Clear list
        animals.clear();

        System.out.println("List sau khi clear: ");
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }
        System.out.println("Size: " + animals.size());

    }
}
