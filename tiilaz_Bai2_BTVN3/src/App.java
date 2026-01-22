public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Double a = 0.0, b  = 0.0, nghiem = 0.0;
        do {
            System.out.println("\n" + "-".repeat(100) + "\n");
            System.out.print("Nhap a: ");
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhap b: ");
            b = scanner.nextDouble();
            scanner.nextLine();
        }
        while (a == 0);
        scanner.close();
        nghiem = -b / a;
        System.out.println("Nghiem cua phuong trinh la: " + nghiem);
    }
}
