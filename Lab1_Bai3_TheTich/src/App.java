public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Double canh = 0.0;
        Double theTich = 0.0;
        do {
            System.out.print("Nhap do dai canh cua hinh lap phuong: ");
            canh = scanner.nextDouble();
            scanner.nextLine();
        }
        while (!(canh > 0));
        scanner.close();
        theTich = Math.pow(canh, 3);
        System.out.println("The tich hinh lap phuong la: " + theTich);
    }
}
