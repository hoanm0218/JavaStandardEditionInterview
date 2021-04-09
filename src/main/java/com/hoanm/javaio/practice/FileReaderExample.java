package com.hoanm.javaio.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {

    public static void main(String[] args) {
        Staff staff1 = new Staff(1,"UNI", 10, 1000);
        Staff staff2 = new Staff(1,"DEV", 15, 2000);
        List<Staff> list = new ArrayList<>();
        list.add(staff1);
        list.add(staff2);

        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("demo.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write("Ghi dữ liệu bằng luồng character");
            fw.write("\nSecond line");
            //Bước 3: Đóng luồng
            fw.close();

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
}
