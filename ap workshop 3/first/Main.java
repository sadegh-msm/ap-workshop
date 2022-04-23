package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.default timer\n" + "2.customized timer");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1){
            ClockDisplay defaultClock = new ClockDisplay();
            while (true){
                System.out.println(defaultClock.getTime());
                defaultClock.timeTick();
                Thread.sleep(1000);
            }
        } else if (choice == 2){
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            int second = scanner.nextInt();

            ClockDisplay preSetClock = new ClockDisplay(hour, minute, second);

            while (true){
                System.out.println(preSetClock.getTime());
                preSetClock.timeTick();
                Thread.sleep(1000);
            }
        }
    }
}
