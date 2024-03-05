import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        while (casos-- > 0) {
            String palavra = scanner.next();

            // Check if the input string is the base string "hamekame"
            if (palavra.equals("hamekame")) {
                System.out.println("ka");
            } else {
                String saida = kameHame(palavra);
                System.out.println(saida);
            }
        }
    }

    static String kameHame(String str) {
        StringBuilder str2 = new StringBuilder();
        int contador = 0;
        int aux;

        // The first position of the output string receives the character 'k';
        // Increment the input string and the output string by one position;
        str2.append('k');
        str = str.substring(1);

        // Count how many 'a' characters there are in the first part of the input string;
        // The number of 'a' characters in this part will determine the number of 'a' characters in the output string;
        while (str.startsWith("a")) {
            str = str.substring(1);
            contador++;
        }

        while (!str.startsWith("a")) {
            str = str.substring(1);
        }

        // If the number of 'a' characters in the first part was 1
        // Then the number of 'a' characters in the output string is equal to that in the second part of the input string;
        if (contador == 1) {
            while (str.startsWith("a")) {
                str2.append(str.charAt(0));
                str = str.substring(1);
            }
        } else {
            // Otherwise, each 'a' in the second part of the input string is worth the number of 'a' in the first part;
            while (str.startsWith("a")) {
                aux = contador;
                while (aux-- > 0) {
                    str2.append('a');
                }
                str = str.substring(1);
            }
        }

        return str2.toString();
    }
}
