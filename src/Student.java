import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm lý thuyết: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập điểm thực hành: ");
        double b = scanner.nextDouble();

        double total = (a + b) / 2;

        System.out.println("Điểm trung bình của học viên: " + total);

        if (total>6){
            System.out.println("Học viên đạt");
        }else
            System.out.println("Học viên trượt");
    }
}
