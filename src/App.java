import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double numero;

        System.out.println("Por favor ingresa un numero");
        numero = sc.nextDouble();

        while (opc != 5) {
            System.out.println(
                    "Selecciona una opcion del menu:\n 1. Determinar si es par\n 2. Determinar si es positivo, negativo o cero\n 3. Verificar si es multiplo de 5\n 4. Verificar si es divisible entre 3 y 4 al mismo tiempo\n 5. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Verificar si el numero es par o impar");
                    if (numero % 2 == 0) {
                        System.out.println("El numero " + numero + " es par");
                    } else {
                        System.out.println("El numero " + numero + " es impar");
                    }
                    break;
                case 2:
                    System.out.println("Verificar si el numero es positivo, negativo o cero");
                    if (numero > 0) {
                        System.out.println("El numero " + numero + " es positivo\n");
                    } else if (numero < 0) {
                        System.out.println("El numero " + numero + " es negativo\n");
                    } else {
                        System.out.println("El numero es cero\n");
                    }
                    break;
                case 3:
                    System.out.println("Verificar si el numero es multiplo de 5\n");
                    if (numero % 5 == 0) {
                        System.out.println("El numero " + numero + " es multiplo de 5\n");
                    } else {
                        System.out.println("El numero " + numero + " no es multiplo de 5\n");
                    }
                    break;
                case 4:
                    System.out.println("Verificar si el numero es divisible entre 3 y 4 al mismo tiempo\n");
                    if (numero % 3 == 0 && numero % 4 == 0) {
                        System.out.println("El numero " + numero + " es divisible entre 3 y 4 al mismo tiempo\n");
                    } else {
                        System.out.println("El numero " + numero + " no es divisible entre 3 y 4 al mismo tiempo\n");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...\n");
                    break;

                default:
                    System.out.println("Por favor selecciona una opcion valida\n");
                    break;
            }
        }
    }
}
