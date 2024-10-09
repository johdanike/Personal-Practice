package codewars;

import java.util.Arrays;

public class StopSpinningMyWords {
    public static String[] words(String word) {
        return word.split("\\W+");
    }
    public static String[] flip(String [] word) {
        for(int index = 0; index < word.length; index++) {
            if(word[index].length() == 5){
                String rev = new StringBuilder(word[index]).reverse().toString();
                word[index] = rev;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flip(words("Hello world this is a boy"))));

    }
}
