package Io.Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
    private static Throwable e;

    public static void main(String[] args) {
        // 입력스트림 : rile 에서 읽어오기

        // 출력스트림 : file 에 쓰기

        // try-with-resources
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시 하지 않아도 자동으로
        try (FileInputStream fis = new FileInputStream("C:\\temp\\file1.txt");
                FileOutputStream fos = new FileOutputStream("C:\\temp\\output1.txt")) {

            int data = 0;
            // read(): 1byte 씩 읽어오기
            // while ((data = fis.read()) != -1) {
            // // System.out.print((char) data);
            // fos.write(data);
            // }

            // 1024
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
