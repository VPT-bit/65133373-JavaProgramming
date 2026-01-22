public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0, delta = 0.0;
        do {
            System.out.print("Nhap he so a (a != 0): ");
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhap he so b: ");
            b = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhap he so c: ");
            c = scanner.nextDouble();
            scanner.nextLine();
        }
        while (a == 0.0);
        scanner.close();
        delta = b * b - 4 * a * c;
        System.out.println("Gia tri delta: " + delta);
    }
}
