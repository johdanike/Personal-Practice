import java.lang.reflect.Array;

public class WhoLikesIt {
    public static String likes(String[] names) {
        int numLikes = names.length;

        switch (numLikes) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (numLikes - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(likes(new String[]{})); // Output: "no one likes this"
        System.out.println(likes(new String[]{"Peter"})); // Output: "Peter likes this"
        System.out.println(likes(new String[]{"Jacob", "Alex"})); // Output: "Jacob and Alex like this"
        System.out.println(likes(new String[]{"Max", "John", "Mark"})); // Output: "Max, John and Mark like this"
        System.out.println(likes(new String[]{"Alex", "Jacob", "Mark", "Max"})); // Output: "Alex, Jacob and 2 others like this"
    }}
