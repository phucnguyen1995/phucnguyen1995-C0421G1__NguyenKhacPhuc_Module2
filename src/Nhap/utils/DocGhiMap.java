//package _21_case_study.utils;
//
//import java.io.*;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class DocGhiMap<T>  {
//
//    public Map<T,Integer> readFileByteStreamMap(String path) {
//    Map<T,Integer> a= new LinkedHashMap<>();
//        try {
//            FileInputStream fileInputStream = new FileInputStream(path);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//            a = (Map<T,Integer>) objectInputStream.readObject();
//
//            objectInputStream.close();
//            fileInputStream.close();
//        }
//        catch (IOException | ClassNotFoundException e) {
//            System.out.println("Data null "+e);
//        }
//        return a;
//    }
//
//
//    public void writeFileByteStream(Map<T,Integer>  b, String path) {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//            objectOutputStream.writeObject(b);
//
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    public void clearData(String path) {
//        try {
//            FileOutputStream outputStream = new FileOutputStream(path);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
////            objectOutputStream.writeObject(objectOutputStream);
//            objectOutputStream.writeObject(null);
//            objectOutputStream.close();
//            outputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
