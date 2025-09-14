package bt;
import java.util.Scanner;
public class btvn4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("So tien gui: ");
    int tien_gui = scanner.nextInt();
    System.out.println("lai suat hang nam x%: ");
    int lai_suat = scanner.nextInt();
    System.out.println("So thang gui  ");
    int so_thang = scanner.nextInt();
    double sum_tien = tien_gui * Math.pow(1 + (lai_suat/100.0/12),so_thang);
    double money_lai = sum_tien - tien_gui;
    System.out.println("So tien lai: " + money_lai + " ,so tien goc cuoi ky: " + sum_tien );
    scanner.close();

}
}
