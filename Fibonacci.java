package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca un Numero");
        
    int Serie = scanner.nextInt() , Num1=0, Num2=1, Suma=1;
    for(int i = 1; i<=Serie; i++) {
        System.out.println("La Secuencia es:" + Suma);
        Suma = Num1 + Num2;
        Num1 =  Num2;
        Num2 = Suma;
    }
        scanner.close();
    }
    
}
