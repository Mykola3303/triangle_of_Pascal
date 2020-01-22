import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Which line number of Pascal's Triangle? ");
            int row = scanner.nextInt();
            System.out.print("Line " + row + " of Pascal's Triangle:\nPrint 0 to exit");
            PascalsTriangle.computeRow(row);
            if ( row ==0){
                break;
            }
        }
    }
}

