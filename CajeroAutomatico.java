package cajero.automatico;
import java.util.Scanner;
public class CajeroAutomatico {

    public static void main(String[] args) {
    int Saldo= 3000, Retirar, Deposito;
    Scanner scanner= new Scanner (System.in);
    System.out.println("Bienvenido al Cajero Automatico");
    while(true)
        
    {
        System.out.println("-------------------------------");
        System.out.println("1.Consulta de Saldo");
        System.out.println("2.Deposito de Dinero");
        System.out.println("3.Retiro");
        System.out.println("-------------------------------");
        System.out.println("Seleccione la Operacion que Desea Realizar");
        int n = scanner.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Saldo : "+Saldo);
                break;
            case 2:
                System.out.print("Ingrese la Cantidad que Desea Depósitar ");
                Deposito= scanner.nextInt();
                Saldo = Saldo + Deposito;
                System.out.println("Su Dinero ha Sido Depositado Exitosamente");
                System.out.println("Su Saldo es : "+Saldo);
                break;
            case 3:
                System.out.println("Ingrese la Cantidad que Desa Retirar");
                Retirar= scanner.nextInt();
                if(Saldo >= Retirar)
               {
                Saldo = Saldo - Retirar;
                System.out.println("Su Retiro fue Exitoso");
                }
                else
                {
                 System.out.println("Fondos Insuficientes");
                }
                System.out.println("");
                break;
            case 4:
            default:
                System.out.println("Opcion No Valida. Por Favor Seleccione una Opccion Valida");
            scanner.close();    
            
        }
        
    }
    
    }
    
}
