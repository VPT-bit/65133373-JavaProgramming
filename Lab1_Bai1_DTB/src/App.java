import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String hoTen = "";
        Float diemTB = 0.0f;
        do {
            System.out.println("\n" + "-".repeat(100) + "\n");
            System.out.print("Nhap ho va ten sinh vien: ");
            hoTen = scanner.nextLine().strip();
            scanner.nextLine();
            System.out.print("Nhap diem trung binh: ");
            diemTB = scanner.nextFloat();
            scanner.nextLine();
        }
        while (!(0.0 <= diemTB && diemTB <= 10.0 && hoTen.length() > 0));
        scanner.close();
        System.out.println("\n" + "-".repeat(100) + "\n");
        System.out.println("*** Ho va ten sinh vien: " + hoTen);
        System.out.println("*** Diem trung binh: " + diemTB);
    }
}
