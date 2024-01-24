package figuras;

import java.util.Scanner;

public class trapeci {
    public static void calculateArea() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base menor: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la base mayor: ");
        double baseMayor = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        double area = (baseMenor + baseMayor) * altura / 2;
        System.out.println("El area del trapecio es: " + area);
        scanner.close();
    }
}
