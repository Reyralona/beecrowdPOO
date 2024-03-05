import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int funcao_rafael(int x, int y){
        return (int) Math.pow((3*x), 2) + (int) Math.pow(y, 2);
    }
    public static int funcao_beto(int x, int y){
        return (int) (2 * Math.pow(x, 2)) + (int) Math.pow(5 * y, 2);
    }
    public static int funcao_carlos(int x, int y){
        return (int) (-100 * x) + (int) Math.pow(y, 3);
    }
    
    public static int winner(int[] array){
        int maxAt = 0;

        for (int i = 0; i < array.length; i++) {
            maxAt = array[i] > array[maxAt] ? i : maxAt;
        }
        return maxAt;
    }

    public static void main(String[] args) throws IOException {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            int x = scn.nextInt();
            int y = scn.nextInt();

            int[] results = {
                funcao_rafael(x, y),
                funcao_beto(x, y),
                funcao_carlos(x, y)
            };
            switch(winner(results)){
                case 0: System.out.println("Rafael ganhou"); break;
                case 1: System.out.println("Beto ganhou"); break;
                case 2: System.out.println("Carlos ganhou"); break;
            }

        }
        
 
    }
 
}