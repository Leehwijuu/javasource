package Io.Io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FrileReaderEx2 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader(".\\src\\io\\FileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr)) {

            String str = null;
            // br.readLine() : 줄 단위로 읽어 오기
            int i = 1;
            while ((str = br.readLine()) != null) {
                System.out.println(i + "\t" + str);
                i++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
