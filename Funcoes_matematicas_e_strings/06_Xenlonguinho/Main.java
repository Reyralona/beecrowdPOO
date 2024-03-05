import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    static int countDivisors(int n) 
    { 
        int cnt = 0; 
        for (int i = 1; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) { 
                // If divisors are equal, 
                // count only one 
                if (n / i == i) {
                    cnt++; 
                } else { // Otherwise count both 
                    cnt = cnt + 2; 
                }
            } 
        } 
        return cnt; 
    } 
        
    
    public static void main(String[] args) throws IOException {
 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            int a = scn.nextInt();
            int c = 0;
            for(int j = 1; j < a+1; j++){
                if(countDivisors(j) % 2 == 0){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
 
}