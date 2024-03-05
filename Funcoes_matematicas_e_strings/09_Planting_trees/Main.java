import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] vals = new Integer[n];

        for (int i = 0; i < n; ++i) {
            vals[i] = scanner.nextInt();
        }

        Arrays.sort(vals, (a, b) -> b - a);

        int ans = vals[0] + 2;
        for (int i = 1; i < n; ++i) {
            if (i + 2 + vals[i] > ans) {
                ans = i + 2 + vals[i];
            }
        }

        System.out.println(ans);
    }
}
