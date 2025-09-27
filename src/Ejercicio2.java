import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese n2: ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese n3: ");
        double n3 = sc.nextDouble();

        if ((n1 < 0 || n1 > 5) || (n2 < 0 || n2 > 5) || (n3 < 0 || n3 > 5)) {
            System.out.println("Nota invalida");
        } else {
            double promedio = (n1 + n2 + n3) / 3.0;
            System.out.printf("Promedio: %.2f%n", promedio);

            if (promedio >= 4.5) {
                System.out.println("Estado : Promocionado ");
            } else if (promedio >= 4.0) {
                System.out.println("Estado : Regular ");
            } else {
                System.out.println("Estado : Reprado  ");
            }
        }
        sc.close();
    }
}
