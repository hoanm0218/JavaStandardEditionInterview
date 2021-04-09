package hoanm.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileExample {

    public static void main(String[] args) throws NoSuchFileException {

        /*
         * Create new File in Java:
         * - Using File, call operation file.createNewFile()
         * - Using Files, call static operation Files.createFile(path)
         * */

        //Using File, call operation file.createNewFile()
        System.out.println("Create file using File: ");
        File file = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\file.txt");
        try {
            if (file.exists()) {
                System.out.println("Can not create new file. Because file have already in: " + file);
            } else {
                if (file.createNewFile()) {
                    System.out.println("File create successfully in: " + file);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //Using Files, call static operation Files.createFile(path)
        System.out.println("Create file using Files: ");
        try {
            Path path = Paths.get("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\path.txt");
            if (Files.exists(path)) {
                System.out.println("Can not create new file. Because file have already in: " + path);
            } else {
                Files.createFile(path);
                System.out.println("File Create successfully in: " + path);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
