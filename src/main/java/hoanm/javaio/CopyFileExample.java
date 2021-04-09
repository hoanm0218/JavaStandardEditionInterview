package hoanm.javaio;

import java.io.*;
import java.nio.file.Files;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        /*
         * Copy File in Java:
         * 1- Using InputStream, OutputStream, byte[] buffer:  call operation inputStream.read(buffer) -> call operation outputStream.write(buffer,0,length)
         * 2- Using Files, call static operation Files.copy(oldFile.toPath(), newFile.toPath());
         * 3- Using FileUtils, call static operation FileUtils.copyFile(oldFile, newFile);
         * */
        File oldFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\oldFile.txt");
        File newFile = new File("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\newFile.txt");
        try {
            if (oldFile.createNewFile()) {
                System.out.println("File create successfully in: " + oldFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //1- Using InputStream, OutputStream, byte[] buffer:
        System.out.println("Copy File Using InputStream and OutputStream: ");
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\oldFile.txt");
            os = new FileOutputStream("C:\\Users\\Uni-phone\\Desktop\\Others\\Java\\IO\\newFile.txt");

            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("Copy success.");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }

        //2- Using Files:
        System.out.println("Copy file with Files:");
        try{
            Files.copy(oldFile.toPath(), newFile.toPath());
            System.out.println("Copy file from: " + oldFile.getAbsolutePath() + " to: " + newFile.getAbsolutePath() + " success.");
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
