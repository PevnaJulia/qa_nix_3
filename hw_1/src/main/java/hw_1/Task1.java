package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task1. Please enter string:");
        int sum = 0;
        try {
            String s = bufferedReader.readLine();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    sum = sum + Character.getNumericValue(chars[i]);
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}