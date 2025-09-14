// Bai2Simple.java
public class bai2 {
    public static void main(String[] args) {
        // Khai báo và gán giá trị trực tiếp
        String ten = "Nguyễn Thiện Tới";
        int tuoi = 20;
        double chieuCao = 1.75;
        char gioiTinh = 'M';
        boolean thichLapTrinh = true;

        // In ra
        System.out.println("=== Thông tin cá nhân ===");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Thích lập trình: " + (thichLapTrinh ? "Có" : "Không"));
    }
}