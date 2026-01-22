import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
public class App {
    public static void xemNhatKy(Scanner inputScanner, String tenFile) throws Exception {
        File file = new File(tenFile);
        if (!file.exists()){
            System.out.println("Chua co nhat ky nao duoc luu.");
            return;
        }
        Scanner fileScanner = new Scanner(file);
        System.out.println("-".repeat(100));
        System.out.println("Nhat ky cua ban:");
        while (fileScanner.hasNextLine()){
            String dongNhatKy = fileScanner.nextLine();
            System.out.println(dongNhatKy);
        }
        fileScanner.close();
        System.out.print("Nhan bat ky de tiep tuc...");
        inputScanner.nextLine();
    }
    public static void themMoiNhatKy(Scanner inputScanner, String tenFile) throws Exception {
        FileWriter fileWriter = new FileWriter(tenFile, true);
        System.out.println("-".repeat(100));
        System.out.print("Nhap noi dung nhat ky: ");
        String noiDungNhatKy = inputScanner.nextLine();
        LocalDate ngayHienTai = LocalDate.now();
        String dongNhatKy = ngayHienTai.toString() + ": " + noiDungNhatKy;
        fileWriter.write(dongNhatKy + System.lineSeparator());
        System.out.println("Da them moi nhat ky.");
        fileWriter.close();
    }
    public static void quanLyNhatKy(String tenFile) throws Exception {
        Scanner inputScanner = new Scanner(System.in);
        String huongDan = """
                Quan ly nhat ky:
                1. Xem nhat ky
                2. Them moi nhat ky
                3. Thoat
                """;
        Integer luaChon = 0;
        do {
            System.out.println("-".repeat(100));
            System.out.println(huongDan);
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (luaChon) {
                case 1:
                    xemNhatKy(inputScanner, tenFile);
                    break;
                case 2:
                    themMoiNhatKy(inputScanner, tenFile);
                    break;
                case 3:
                    System.out.println("\nThoat chuong trinh.");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le. Vui long thu lai.");
            }
        } while (luaChon != 3);
        inputScanner.close();
    }
    public static void main(String[] args) throws Exception {
        String tenFile = "nhatky.txt";
        quanLyNhatKy(tenFile);
    }
}
