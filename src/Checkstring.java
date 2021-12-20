import java.util.Scanner;

public class Checkstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi a:");
        String a=scanner.nextLine();

        System.out.println("Nhập vào chuỗi b:");
        String b=scanner.nextLine();

        if (a.equals(b)==true){
            System.out.println("Hai chuỗi bằng nhau");
        }else
        System.out.println("Hai chuỗi không bằng nhau");

        if (a.length()==b.length()){
            System.out.println("Kích thước hai chuỗi bằng nhau");
        }
        else
            System.out.println("Kích thước hai chuỗi không bằng nhau");
    }
}
