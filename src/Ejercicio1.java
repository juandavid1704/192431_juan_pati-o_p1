import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("Suma: " + (a + b));
            System.out.println("Diferencia: " + (a - b));
        } else {
            System.out.println("Producto: " + (a * b));
            if (b == 0) {
                System.out.println("Divicion no definida (b es 0)");
            } else {
                System.out.println("Division (a/b): " + (a / b));
            }
        }
        sc.close();
    }
}
