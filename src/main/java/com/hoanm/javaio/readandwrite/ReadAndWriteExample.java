package com.hoanm.javaio.readandwrite;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteExample {
    public static void main(String[] args) throws IOException {
        /*
         * Read File in Java:
         * 1- Using Scanner
         * 2- Using BufferedReader
         * 3- Using File và FileReader
         * */

        //1- Using Scanner:
        System.out.println("Read input using Scanner");
        String url = "C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\ReadAndWrite.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        try{
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }finally {
            scanner.close();
            fileInputStream.close();
        }

        //2- Using BufferedReader
        System.out.println("\nRead input using BufferedReader");
        FileInputStream fileInputStream1 = new FileInputStream(url);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream1));
        String line = bufferedReader.readLine();
        try{
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }finally {
            fileInputStream.close();
            bufferedReader.close();
        }

        //3- Using File & FileReader
        System.out.println("\nRead using File & FileReader: ");
        File file = new File(url);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String line1 = reader.readLine();
            while (line1 != null) {
                System.out.println(line1);
                line1 = reader.readLine();
            }
        } finally {
            reader.close();
            // file.close();
        }


        /*
         * Write File in Java:
         * 1- Using FileWriter
         * */

        //1- Using FileWriter
        System.out.println("\nWrite to file Using FileWriter:");
        try{
            //Step 1: create instance and connect
            String newUrl = "C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\WriteFile.txt";
            File file1 = new File(newUrl);
            FileWriter fileWriter = new FileWriter(file1);

            //Step 2: Write to file
            fileWriter.write("Url of file" + newUrl);
            System.out.println("Write done");
            //Step3: Close connect
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
