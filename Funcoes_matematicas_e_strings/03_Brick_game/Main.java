import java.io.IOException;
import java.util.Scanner; 
import java.util.Arrays;
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
        int[] cases = new int[n];

        for(int i = 0; i < n; i++){
            int np = scn.nextInt();
            int[] ages = new int[np];
            for (int j = 0; j < np; j++){
                ages[j] = scn.nextInt();
            }
            Arrays.sort(ages);
            cases[i] = ages[np/2];
        }

        for (int i = 0; i < n; i++){
            System.out.println("Case " + (i+1) + ": " + cases[i]);
        } 
    }
 
}