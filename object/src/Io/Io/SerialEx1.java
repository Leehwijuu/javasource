package Io.Io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialEx1 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", "엔지니어", "hong@naver.com");
        Person p2 = new Person("이보미", "교사", "bom@naver.com");

        try (FileInputStream fis = new FileInputStream("c:\\temp\\person.dat");
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis)) {

            // java.io.NotSerializableException: Io.Io.Person
            for (int i = 0; i < 2; i++) {
                Person p1 = (Person) ois.readObject();
                System.out.println(p1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
