import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            String a = "" + scn.nextInt();
            String b = "" + scn.nextInt();
            
            
            if(a.endsWith(b)){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
 
    }
 
}