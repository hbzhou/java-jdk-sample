package com.itsz.java.ej3.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Elvis instance = Elvis.getInstance();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("a.obj"))) {
            outputStream.writeObject(instance);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a.obj"));
            Object obj = objectInputStream.readObject();
            System.out.println(instance.equals(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
