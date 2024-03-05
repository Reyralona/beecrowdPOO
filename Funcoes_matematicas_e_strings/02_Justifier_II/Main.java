import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<ArrayList<String>> paragraph = new ArrayList<ArrayList<String>>();

        int n = sc.nextInt();
        int skipline = 0;

        while (n != 0) {
            ArrayList<String> phrases = new ArrayList<String>();
            sc.nextLine(); 
            int string_max = 0;

            for (int i = 0; i < n; i++) {
                phrases.add(sc.nextLine().trim().replaceAll(" +", " "));
                if (phrases.get(i).length() > string_max) {
                    string_max = phrases.get(i).length();
                }
            }

            for (int i = 0; i < n; i++) {
                while(phrases.get(i).length() < string_max) { 
                    phrases.set(i, " " + phrases.get(i));
                }
            }
            phrases.set(phrases.size() - 1, phrases.get(phrases.size() - 1)); 
            paragraph.add(phrases);
            n = sc.nextInt(); 
            skipline++;
        }
        
        int i = 0;
        for (ArrayList<String> lista : paragraph){
            for (String elemento : lista){
                prln(elemento);
            }
            if (i != skipline - 1) {
                prln("");
            }
            i++;
        }
    }
    
    public static void prln(Object o) {
        System.out.println(o);
    }
}