public class App {
    public static void usdToVnd(java.util.Scanner scanner){
        Double usd = nhapTien(scanner);
        scanner.nextLine();
        Double vnd = usd * 23500;
        System.out.printf("So tien %.2f USD sau khi chuyen doi la: %.2f VND\n", usd, vnd);
        System.out.print("Nhan bat ky de tiep tuc...");
        scanner.nextLine();
    }
    public static void eurToVnd(java.util.Scanner scanner){
        Double eur = nhapTien(scanner);
        scanner.nextLine();
        Double vnd = eur * 27000;
        System.out.printf("So tien %.2f EUR sau khi chuyen doi la: %.2f VND\n", eur, vnd);
        System.out.print("Nhan bat ky de tiep tuc...");
        scanner.nextLine();
    }
    public static double nhapTien(java.util.Scanner scanner){
        System.out.print("Nhap so tien can chuyen: ");
        return scanner.nextDouble();
    }
    public static void quanLyDoiTienTe(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String huongDan = """
            Chuyen doi tien te (VND, USD):
            1. USD sang VND
            2. EUR sang VND
            3. Thoat
            """;
        Integer luaChon = 0;
        do {
            System.out.println("-".repeat(100));
            System.out.println(huongDan);
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon){
                case 1:
                    usdToVnd(scanner);
                    break;
                case 2:
                    eurToVnd(scanner);
                    break;
                case 3:
                    System.out.println("\nThoat chuong trinh.");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le. Vui long chon lai!");
                    break;
            }
        }
        while (luaChon != 3);
        scanner.close();
    }
    public static void main(String[] args) throws Exception {
        quanLyDoiTienTe();
    }
}
