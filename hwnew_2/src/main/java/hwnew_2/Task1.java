package hwnew_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static String stringVowels(String s) {
       String vow="aoeuiy";
        String v = "0";
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);
            if (vow.indexOf(sym)!=-1) {
                v = v.concat(String.valueOf(sym));
            }
        }
        v = v.substring(1);
        return v;
    }

    public static String stringCons(String s) {
        String cons="bcdfghjklmnpqrstvwxz";
        String v = "0";
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);
            if (cons.indexOf(sym)!=-1) {
                v = v.concat(String.valueOf(sym));
            }
        }
        v = v.substring(1);
        return v;
    }

    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task1. Please enter strings:");

        try {
            String s = bufferedReader.readLine();
            System.out.println("Please enter keyword:");
            String search = bufferedReader.readLine();
            String[] words = s.split(" ");
            for (String word : words) {
                if (word.startsWith(search)) {
                    System.out.println("This row starts with keyword " + search + ":" + word);
                } else if (word.endsWith(search)) {
                    System.out.println("This row ends with keyword " + search + ":" + word);
                } else {
                    byte match = 0;
                    for (int i = 0; i < word.length(); i++) {
                        char sym = word.charAt(i);
                        if (search.indexOf(sym) != -1) {
                            match = 1;
                        }
                    }
                    if (match == 1) {
                        System.out.println("This row and keyword have 1 or more common symbols:" + word);

                    }
                }
            }

            System.out.println("Please enter strings for search vowels sequence:");
            String sv = bufferedReader.readLine();
            System.out.println("Please enter keyword:");
            String searchv = bufferedReader.readLine();
            String[] wordsv = sv.split(" ");
            String res;
            for (String word : wordsv) {
                res = stringVowels(word);

                String w = stringVowels(searchv);

                if (res.contains(w)) {
                    System.out.println("This match of vowels is found " + w + ":" + word);
                } else {
                    System.out.println("No exact match for " + word);
                }
            }

            System.out.println("Please enter strings for search consonants sequence:");
            String cv = bufferedReader.readLine();
            System.out.println("Please enter keyword:");
            String searchc = bufferedReader.readLine();
            String[] wordsc = cv.split(" ");
            String resc;
            for (String word : wordsc) {
                resc = stringCons(word);

                String key = stringCons(searchc);

                if (resc.contains(key)) {
                    System.out.println("This match of consonants is found " + key + ":" + word);
                } else {
                    System.out.println("No exact match for " + word);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}