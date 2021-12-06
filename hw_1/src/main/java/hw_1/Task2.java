package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task2. Please enter string:");
        try {
            String s = bufferedReader.readLine();
            int count = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i]) == false) {
                    char res = chars[i];
                    count = 1;
                    for (int j = i + 1; j < chars.length; j++) {
                        if (res == chars[j]) {
                            count = count + 1;
                            chars[j] = '0';
                        }
                    }
                    System.out.println(res + "-" + count);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
