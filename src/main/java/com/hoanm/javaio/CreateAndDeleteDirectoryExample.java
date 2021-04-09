package com.hoanm.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateAndDeleteDirectoryExample {
    public static void main(String[] args) throws IOException {
        /*
         * Move File in Java:
         * 1- Using File, call operation dirFile.mkdir())
         * 2- Using Files, call static operation Files.createDirectories(dirPath);
         * */

        //1- Using File
        System.out.println("Create directory by File");
        File dirFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\dirFile");
        if(dirFile.mkdir()){
            System.out.println("Directory created in: " + dirFile.getAbsolutePath());
        }

        //2- Using File
        System.out.println("Create directory by Files: ");
        Path dirPath = Paths.get("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\dirPath");
        Files.createDirectories(dirPath);
        System.out.println("Directory created in: " + dirPath);
    }
}
