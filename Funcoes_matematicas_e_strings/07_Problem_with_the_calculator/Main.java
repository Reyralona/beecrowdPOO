import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
 
public class Main {
    
    public static boolean hasText(String str) {
        return null != str && !"".equals(str.trim());
    }
    
    public static String[] removeEmpty(String[] origArray) {
        List<String> newArr = new ArrayList<String>();
        for (String el : origArray) {
            if (hasText(el)) {
                newArr.add(el);
            }
        }
        return newArr.toArray(new String[newArr.size()]);
    }
    
    public static int sum(String[] arr){
        int out = 0;
        for (int i = 0; i < arr.length; i++){
            out = out + Integer.valueOf(arr[i]);
        }
        return out;
    }
    
    public static int solve(String input){
        String out = input.replaceAll("[A-Za-z]", " ").trim();
        String[] splited = out.split("\\s+");
        return sum(removeEmpty(splited));
    }
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            String inp = scn.next();
            int result = solve(inp);
            System.out.println(result);
        }
    }
 
}