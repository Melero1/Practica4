package figuras;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int option;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Calculadora de Área - Seleccione una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Trapecio");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    Circle.calculateArea();
                    break;
                case 2:
                    Square.calculateArea();
                    break;
                case 3:
                    Triangle.calculateArea();
                    break;
                case 4:
                    Rectangle.calculateArea();
                    break;
                case 5:
                    Pentagon.calculateArea();
                    break;
                    
                case 6:
                    trapeci.calculateArea();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            scanner.close(); 
        } while (option != 0);
           }
}
