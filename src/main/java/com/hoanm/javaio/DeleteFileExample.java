package com.hoanm.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileExample {

    public static void main(String[] args) throws NoSuchFileException {

        /*
         * Delete exist File in Java:
         * - Using File, call operation file.exists() to check exist && file.delete() to delete file
         * - Using Files, call static operation Files.delete(path)
         * */

        //Using File, call operation file.exists() to check exist && file.delete() to delete file
        System.out.println("Delete file using File: ");
        File deleteFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\file.txt");
        if (deleteFile.exists() && deleteFile.delete()) {
            System.out.println("File deleted successfully");
        }else {
            System.out.println("File not found");
        }

        //Using Files, call static operation Files.delete(path)
        System.out.println("Delete file using Files: ");
        try {
            Path path = Paths.get("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\path.txt");
            Files.delete(path);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            System.out.println("Can not delete file because did not find file with your path" + e);
        }



    }
}
