package String;

public class StringReverse {
    public static void main(String[] args) {
        String a = "aditya";
        String reversed = new StringBuilder(a).reverse().toString();
        System.out.println(reversed);

        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }
        System.out.println(rev);
    }
}
