package par.o.impar;
import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
    Scanner scanner= new Scanner (System.in);
    System.out.print("Ingrese un Numero Entero:" );
    int numero = scanner.nextInt();
    if (numero % 2 ==0) {
       System.out.println("El numero " + numero + " es Par");         
    } 
    else { 
            System.out.println("El numero "+ numero + " es Impar");
            }
    }
    
}
