package hoanm.string;

public class StringStringbufferStringbuilderExample {
    public static void main(String[] args) {

        /*************STRING*************/
        System.out.println("************String Example************");
        //new String by literal
        String string = "String";
        //new String by new String
        String string1 = new String("String");

        System.out.println("string.equals(string1): " + string.equals(string1)); //true
        System.out.println("string==string1: " + string == string1); //False
        //=> s and s1 true about value, but it false about location save in Heap memory

        //Immutable -> Thread-safe
        //Reference string2 to string: string2 and string same value, same location
        String string2 = string;
        //Change value of string string
        string = "ChangeString";
        //Value of string changed but string2 not change
        System.out.println("string - string2 after changed string: " + string + " - " + string2);


        /*************STRING-BUFFER*************/
        System.out.println("************StringBuffer Example************");
        //new StringBuffer by literal: not support
        //StringBuffer stringBuffer = "StringBuffer";
        //new StringBuffer by new StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer("StringBuffer");

        //Mutable -> Thread-safe(synchronized in all operation of StringBuffer)
        //Reference stringBuffer2 to stringBuffer1
        StringBuffer stringBuffer2 = stringBuffer1;
        //Change value of stringbuffer sb1
        stringBuffer1.append("Changed");
        //Value of sb1 and sb2 changed
        System.out.println("stringBuffer1 - stringBuffer2 after changed sb1: " + stringBuffer1 + " - " + stringBuffer2);

        /*************STRING-BUILDER*************/
        System.out.println("************StringBuilder Example************");
        //new StringBuffer by literal: not support
        //StringBuffer sb = "StringBuffer";
        //new StringBuffer by new StringBuffer
        StringBuilder stringBuilder1 = new StringBuilder("StringBuffer");

        //Mutable -> Thread-safe(do not have keyword synchronized in all operation of StringBuilder)
        //Reference stringBuilder2 to stringBuilder1
        StringBuilder stringBuilder2 = stringBuilder1;
        //Change value of stringBuilder stringBuilder
        stringBuilder1.append("Changed");
        //Value of stringBuilder1 and stringBuilder2 changed
        System.out.println("stringBuilder1 - stringBuilder2 after changed stringBuilder1: " + stringBuilder1 + " - " + stringBuilder2);
    }
}
