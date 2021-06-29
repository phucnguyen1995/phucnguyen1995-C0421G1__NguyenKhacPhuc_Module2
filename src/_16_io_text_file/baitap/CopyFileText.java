package _16_io_text_file.baitap;

import java.io.*;

public class CopyFileText {
    public static String copyFile(File file) throws IOException {
        FileReader fr =new FileReader(file);
        int i;
        String result = "";
        while ((i = fr.read()) != -1) {
            result += (char)i;
        }
        fr.close();
        return result;
    }

    public static void writeFile(File file, String line) {
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            File readFile = new File("src\\_16_io_text_file\\data\\source_file");
            File writeFile = new File("src\\_16_io_text_file\\data\\target_file");
            String str = copyFile(readFile);
            writeFile(writeFile, str);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
