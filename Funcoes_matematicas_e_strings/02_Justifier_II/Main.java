import java.io.IOException;
import java.util.Scanner; 
 
public class Main {
    
    public static int largest(String[] arr) { 
        int max = arr[0].length();
        for (int i = 1; i < arr.length; i++) 
            if (arr[i].length() > max) 
                max = arr[i].length(); 
        return max; 
    } 
    
    public static String strip(String input){
        return input.trim().replaceAll(" +", " ");
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt() + 1;
        String[] buff = new String[n];
        
        for(int i = 0; i < n; i++){
            String str = strip(scn.nextLine());
            buff[i] = strip(str);
        }
        
        for(int i = 0; i < n; i++){
            int max = largest(buff);
            String out = String.format("%" + (max) + "s", buff[i]); 
            if(out != "")
                System.out.println(out);
        }
        
 
    }
 
}