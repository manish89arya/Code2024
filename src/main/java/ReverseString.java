class ReverseString {

    public static void main(String[] args) {
        String input = "Manish";
        String reverse = ReverseString.reverse(input);
        System.out.println(reverse);
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(rev);
            rev = rev + s.charAt(i);

        }

        return rev;
    }

}