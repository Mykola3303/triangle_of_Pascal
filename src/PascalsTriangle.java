import java.io.FileNotFoundException;
import java.io.FileReader;

public class PascalsTriangle {
    public static void computeRow(int n) {
        int counter;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascalValue(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }
}


