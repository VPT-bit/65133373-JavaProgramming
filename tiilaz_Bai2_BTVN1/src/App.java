public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Double soGioLam = 0.0;
        Double luongTheoGio = 0.0;
        Double tongLuong = 0.0;
        do {
            System.out.print("Nhap so gio lam viec trong thang: ");
            soGioLam = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhap luong theo gio: ");
            luongTheoGio = scanner.nextDouble();
            scanner.nextLine();
        }
        while (soGioLam <= 0 || luongTheoGio <= 0);
        scanner.close();
        if (soGioLam <= 40)
            tongLuong = soGioLam * luongTheoGio;
        else
            tongLuong = 40 * luongTheoGio + (soGioLam - 40) * luongTheoGio * 1.5;
        System.out.println("Tong luong trong thang la: " + tongLuong);
    }
}
