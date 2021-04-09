package hoanm.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandleExceptionExample {
    public static void main(String[] args) {

        /*
        * Exception:
        * -Checked Exception: extends Exception and handle in Compile
        * -Unchecked Exception: extends RuntimeException and handle in Runtime
        *  */

        //Checked Exception
        System.out.println("********Checked Exception********");
        File file = new File("not_existing_file.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Your file not found: " + e);
        }

        //Unchecked Exception
        System.out.println("********Unchecked Exception********");
        int[] array = {1,2,3};
        try{
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index out of bounds of Array: " + e);
        }


    }
}
