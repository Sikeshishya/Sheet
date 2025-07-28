package Strings;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        for (; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                break;
            } else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
