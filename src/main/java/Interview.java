public class Interview {


    public static void testQuestion() {
        System.out.println("2025 Test Begins...!");

        String rev = "";
        String original = "Manish Arya";
        System.out.println(original.length());
        for (int i = original.length() - 1; i >= 0; i--) {
            System.out.println("index is: " + i);
            rev = rev + original.charAt(i);

        }
        System.out.println("Reverse String is: " + rev);
    }

}
