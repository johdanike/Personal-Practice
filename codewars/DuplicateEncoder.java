public class DuplicateEncoder {
    public static void main(String[] args) {}

    static String encode(String word){
        for (int index = 0; index <= word.length(); index++){
            if(word.charAt(index) == word.charAt(word.length() - index - 1)){
                return word.substring(index, index + 1);
            }
        }
        return word;
    }
}
