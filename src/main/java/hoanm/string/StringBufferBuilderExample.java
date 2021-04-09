package hoanm.string;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
        // StringBuffer and StringBuilder are used when you want to modify
        // object values.
        StringBuffer stringbuffer = new StringBuffer("12345");
        StringBuffer stringBuffer12 = stringbuffer;
        stringbuffer.append("6789");
        System.out.println(stringbuffer); // 123456789
        System.out.println("String buffer12 = " + stringBuffer12);
        // All StringBuffer methods modify the value of the object.

        StringBuilder sb = new StringBuilder("0123456789");
        StringBuilder sb12 = sb;
        // StringBuilder delete(int startIndex, int endIndexPlusOne)
        System.out.println("String builder sb= " + sb.delete(3, 7));// 012789
        System.out.println("String builder sb12= " + sb12);

        StringBuilder sb1 = new StringBuilder("abcdefgh");
        // StringBuilder insert(int indext, String whatToInsert)
        System.out.println(sb1.insert(3, "ABCD"));// abcABCDdefgh

        StringBuilder sb2 = new StringBuilder("abcdefgh");
        // StringBuilder reverse()
        System.out.println(sb2.reverse());// hgfedcba

        // Similar functions exist in StringBuffer also

        // All functions also return a reference to the object after modifying
        // it.
        // This allows a concept called method chaining.
        StringBuilder sb3 = new StringBuilder("abcdefgh");
        System.out.println(sb3.reverse().delete(5, 6).insert(3, "---"));// hgf---edba

    }
}
