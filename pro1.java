import java.util.Random;
import java.util.Scanner;

public class pro1 {
    public static void main(String[] args){

        try {
            Random valorRandom = new Random();
            int valor1 = valorRandom.nextInt(100)+1;

            int valor2 = valorRandom.nextInt(100)+1;
            int suma = valor1 + valor2;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Cual es la respuesta deñ siguiente problema : "+ valor1 + "+" + valor2);

            System.out.println("Ingrese su respuesta : ");
            int RespUser = scanner.nextInt();

            if (RespUser == suma){
                System.out.println("¡Correcto!");
            } else {
                System.out.println("La repuesta es incorrecta. La respuesta es :" + suma);
            }

        } catch (Exception e){
            System.out.println("Ingrese un caracter valido" );
        }
        System.exit(0);


        
    }
}
