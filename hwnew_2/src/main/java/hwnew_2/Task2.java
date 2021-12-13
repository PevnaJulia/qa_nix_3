package hwnew_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Task2 {
    public void run(){
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task2. Please enter several words:");

        try {
        String s = bufferedReader.readLine();
        String[] words = s.split(" ");
        HashMap<String, String> d = new HashMap<>();
        String str="0";
        for (String word : words) {
            for (int i=0;i<word.length();i++){
                int key = (int)word.charAt(i);
                str=str.concat(String.valueOf(key));
            }
            str=str.substring(1);
            d.put(str,word);
            }
            ArrayList<String>keys = new ArrayList<>(d.keySet());
            System.out.println("Keys:"+keys);
            ArrayList<String>values = new ArrayList<>(d.values());
            System.out.println("Values:"+values);
        } catch (IOException e) {
        e.printStackTrace();
    }
}
}
