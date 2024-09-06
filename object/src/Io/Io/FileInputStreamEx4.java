package Io.Io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class FileInputStreamEx4 {
    public static void main(String[] args) {
        // 입력스트림 : rile 에서 읽어오기

        // 출력스트림 : file 에 쓰기

        // try-with-resources
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시 하지 않아도 자동으로
        try (FileInputStream fis = new FileInputStream("C:\\temp\\file1.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("C:\\temp\\output1.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            int data = 0;

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[4096];
            while ((data = bis.read(b)) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
