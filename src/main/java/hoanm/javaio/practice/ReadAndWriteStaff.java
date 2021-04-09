package hoanm.javaio.practice;

import java.io.*;

public class ReadAndWriteStaff {
    /*
    * Tạo lớp Staff có các thuộc tính id, name, age và salary.
    * Viết setter, getter, constructor và toString.
    * Viết phương thức cho phép nhập thông tin cho 3 nhân viên từ bàn phím. Sử dụng FileWriter để ghi thông tin vào nhanvien.txt.
    * Viết phương thức để đọc nội dung file nhanvien.txt và in những gì đọc được từ file ra màn hình.
    * */
    public static void main(String[] args) throws IOException {

        //Input staff to staff[]
        Staff staff[] = {
                new Staff(1,"Uni Dev",25,1000),
                new Staff(2, "Make Sense", 22, 800),
                new Staff(3, "Toni Vo", 30, 1500)
        };
        System.out.println("Input success. Your staff[]: ");
        for (int i = 0; i < staff.length; i++){
            System.out.println(staff[i]);
        }

        String url = "staffs.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Staff[] st;

        try{
            //Create object and connect
            fos = new FileOutputStream(url);
            oos= new ObjectOutputStream(fos);

            //Write array staffs to file
            oos.writeObject(staff);
            System.out.println("\nWrite staff[] to file success");

            fis = new FileInputStream(url);
            ois = new ObjectInputStream(fis);

            //Read from file to st[]
            st = (Staff[]) ois.readObject();
            System.out.println("\nYour array staffs read from file");
            for(Staff s: st){
                System.out.println(s);
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            //Close connect
            if(fos != null){
                fos.close();
            }
            if(oos != null){
                oos.close();
            }
            if(fis != null){
                fis.close();
            }
            if(ois != null){
                ois.close();
            }
            System.out.println("\nClose all connection success");
        }

    }
}




















