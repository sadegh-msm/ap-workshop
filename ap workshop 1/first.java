import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int max;
        int count = 0;

        if (i>=j){
            max = i;
        } else {
            max = j;
        }

        for (int k = 2; k <= max; k++) {
            if (i % k == 0 && j % k == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("true");
        } else if (count != 0){
            System.out.println("false");
        }
    }
}