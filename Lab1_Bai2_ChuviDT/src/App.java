public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Float a = Float.valueOf(0);
        Float b = Float.valueOf(0);
        Float chuVi = Float.valueOf(0);
        Float dienTich = Float.valueOf(0);
        do {
            System.out.println("Nhap do dai hai canh cua hình chu nhat: ");
            System.out.print("Canh a: ");
            a = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("Canh b: ");
            b = scanner.nextFloat();
            scanner.nextLine();
        }
        while (!(a > 0 && b > 0));
        scanner.close();
        chuVi = 2 * (a + b);
        dienTich = a * b;
        System.out.println("-".repeat(100));
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        System.out.println("Canh nho cua hinh chu nhat la: " + Math.min(a, b));
    }
}
