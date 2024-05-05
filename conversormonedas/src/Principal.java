import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws RuntimeException, IOException {
        ConversorMonedas conversor = new ConversorMonedas();
        Scanner lectura = new Scanner(System.in);
        var opcion = 0;
        var cantidad = 0;

        while(opcion != 7) {

            String menu = "Elija una opcion:\n" +
                    "1. Dollar a Colones CR\n" +
                    "2. Dollar a Euros\n" +
                    "3. Colones CR a Dollar\n" +
                    "4. Colones CR a Euros\n" +
                    "5. Dollar a Yen\n" +
                    "6. Dallar a Peso MX\n" +
                    "7. Salir";
            System.out.println(menu);
            opcion = Integer.parseInt(lectura.nextLine());

            switch (opcion){

                case 1:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("USD", "CRC", cantidad);
                    break;
                case 2:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("USD", "EUR", cantidad);
                    break;

                case 3:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("CRC", "USD", cantidad);
                    break;

                case 4:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("CRC", "EUR", cantidad);
                    break;

                case 5:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("USD", "JPY", cantidad);
                    break;

                case 6:
                    System.out.println("Digite la cantidad a convertir");
                    cantidad = Integer.parseInt(lectura.nextLine());
                    conversor.ConversorAPI("USD", "MXN", cantidad);
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;


            }


        }

    }


}
