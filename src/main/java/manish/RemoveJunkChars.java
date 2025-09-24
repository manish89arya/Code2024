package manish;

class RemoveJunkChars {

    public static void main(String[] args) {

        String s = "*&*&%%gghhjj22j(*&*";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }


}