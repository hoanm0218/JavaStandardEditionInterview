package com.hoanm.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileExample {
    public static void main(String[] args) throws IOException {
        /*
         * Move File in Java:
         * 1- Using File, call operation oldFile.renameTo(newFile)
         * 2- Using Files, call static operation Files.move(oldPath, newPath);
         * 3- Using FileUtils, call static operation FileUtils.moveFile(oldFile, newFile);
         * */

        //1. Using File
        System.out.println("Move file using File: ");
        File oldFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\oldFile.txt");
        File newFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\newFile.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("Move file " + oldFile.getAbsolutePath() + " to " + newFile.getAbsolutePath() + " success.");
        }

        //2. Using Files
        System.out.println("Move file using Files: ");
        Path oldPath = Paths.get("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\path.txt");
        Path newPath = Paths.get("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\path.txt");
        Files.move(oldPath, newPath);
    }
}
