// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    
    public static String[] removeDuplicates(String[] inputArray) {
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(inputArray));
        String[] resultArray = uniqueSet.toArray(new String[0]);

        return resultArray;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String prompt = scn.nextLine();
    
        String[] splited = prompt.split("\\s+");
        for(int i = 0; i < splited.length; i++){
            String[] sillable = splited[i].split("(?<=\\G.{2})");
            splited[i] = String.join("", removeDuplicates(sillable));
        }
        String out = String.join(" ", splited);
        System.out.println(out);
        
    }
}