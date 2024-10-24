
public class ListFiltering {

    public static boolean filterList(String list, String numbs) {
        int j = list.length() - numbs.length();
        for (int i = list.length() - numbs.length(); i < list.length(); i++) {
            if(list.charAt(i) != numbs.charAt(i-j))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(filterList("samurai", "ra"));

    }
}
