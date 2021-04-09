package hoanm.practice;

public class AlphabeticPatternExample {

    /**
     * Print Alphabetic Pattern Logic: A - Z
     * 1. Pattern
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     * ..........
     * <p>
     * 2.Pattern
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     * .............
     */
    public static void main(String[] args) {

        AlphabeticPatter1();

        AlphabeticPatter2();
    }

    //  Pattern 1
    public static void AlphabeticPatter1() {

        int alpha = 65;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alpha + j) + " ");
            }
            System.out.println();
        }
    }

    //  Pattern 2
    public static void AlphabeticPatter2() {

        int alpha = 65;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alpha) + " ");
            }
            System.out.println();
            alpha++;
        }
    }
}
