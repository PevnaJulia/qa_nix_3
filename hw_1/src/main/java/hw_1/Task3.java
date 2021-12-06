package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task3. Please enter lesson number from 1 to 10:");
        int a;
        try {
            a = Integer.parseInt(bufferedReader.readLine());
            if (a > 0 && a < 11) {
                int h = 9 + (a - 1);
                int m = Math.abs(45 - 5 * (a - (a % 2)));
                System.out.println(h + " " + m);
            } else {
                System.out.println("Invalid data: lesson number should be from 1 to 10");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid data: lesson number should be from 1 to 10");
        }
    }
}
