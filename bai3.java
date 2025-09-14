import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            int a = sc.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int b = sc.nextInt();

            int tong = a + b;
            int hieu = a - b;
            int tich = a * b;

            System.out.println("\nKết quả:");
            System.out.println(a + " + " + b + " = " + tong);
            System.out.println(a + " - " + b + " = " + hieu);
            System.out.println(a + " * " + b + " = " + tich);

            if (b != 0) {
                int thuong = a / b;        // phép chia lấy phần nguyên
                int phanDu = a % b;       // phần dư
                System.out.println(a + " / " + b + " = " + thuong + " (phần nguyên)");
                System.out.println(a + " % " + b + " = " + phanDu + " (phần dư)");
            } else {
                System.out.println("Không thể tính thương và phần dư: chia cho 0.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Lỗi: vui lòng nhập đúng số nguyên.");
        } finally {
            sc.close();
        }
    }
}
