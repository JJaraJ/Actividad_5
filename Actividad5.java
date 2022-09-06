
public class Actividad5 {
import java.util.Scanner;


    public static void main(String[] args) {
        //La clase se llama Actividad 5 y los atributos serán double para que pueda llevar a cabo las operaciones
// Se solicita el valor del primer número al usuario
        System.out.println("Ingresa el valor del primer número");
// Se almacena el valor que el usuario escribe en la variable num1
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
// Se solicita el valor del segundo número al usuario
        System.out.println("El valor del primer número es: " + " " + num1);
// Se almacena el valor que el usuario escribe en la variable num2
        System.out.println("Ingresa el valor del segundo número");
        Scanner scanner2 = new Scanner(System.in);
        double num2 = scanner2.nextDouble();

        System.out.println("El valor del segundo número es: " + " " + num2);
// Se empezarán a imprimir las operaciones
        double sumar = num1 + num2;
        double restar = num1-num2;
        double dividir = num1/num2;
        double modulo = num1%num2;
        double multiplicar = num1 * num2;

        System.out.println("sumar = "+sumar);
        System.out.println("restar = "+restar);
        System.out.println("multiplicar = "+multiplicar);
        System.out.println("modulo = "+modulo);
        System.out.println("dividir = "+dividir);



    }
}

