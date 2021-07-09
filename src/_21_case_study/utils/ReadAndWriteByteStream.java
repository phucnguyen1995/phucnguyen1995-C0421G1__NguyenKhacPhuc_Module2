package _21_case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteByteStream<T> implements InterFaceByteStream<T> {

    @Override
    public List<T> readFileByteStream(String path) {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Data null "+e);
        }
        return list;
    }

    @Override
    public void writeFileByteStream(List<T> list, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void clearData(String path) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(objectOutputStream);
            objectOutputStream.writeObject(null);
            objectOutputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


//    bên Map:

//    public Map<T, Integer> readMapbyteStream(String path) {
//    Map<T, Integer> list = new LinkedHashMap<>();
//    try {
//        FileInputStream fileInputStream = new FileInputStream(path);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        list = (Map<T, Integer>) objectInputStream.readObject();
//        objectInputStream.close();
//        fileInputStream.close();
//    } catch (ClassNotFoundException | IOException e) {
//        System.out.println(" data null");
//    }
//    return list;
//    }

//    public void writeMapByteStream(Map<T, Integer> list, String path) {
//        try {
//            FileOutputStream outputStream = new FileOutputStream(path);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(list);
//            objectOutputStream.close();
//            outputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
