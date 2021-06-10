package _02_loop.baitap;

public class SoNguyenTo2 {
    public static void main(String[] args) {
        int run = 2;
        while (true){
            boolean check = true;
            for (int i = 2; i < run; i++) {
                if (run % i == 0) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println(run);
            }
            if (run>= 100) {
                break;
            }
            run++;
        }
    }
}
