public class StringsEndingWith {

    public static String[] Solution(String str, String ending){
//        String[]wordOne = str.split();

        for(String  word : str.split("")){
            System.out.println(word);
        }
        return str.split(ending);
    }



    public static void main(String[] args) {
    }
}
