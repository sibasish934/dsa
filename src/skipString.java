public class skipString {
    public static void main(String[] args) {
        try {
            skip("", "baccad");
        }
        catch (Exception ob)
        {
            System.out.println("\n Error... "+ob);
        }
    }

    static void skip(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(p);
        }
       if (up.length() < 1) {
           System.out.println("\n Next line is empty...");
        } else {
            char ch = up.charAt(0);

            if (ch == 'a') {
                skip(p, up.substring(1));
            } else {
                skip(p + ch, up.substring(1));
            }
        }
    }

}