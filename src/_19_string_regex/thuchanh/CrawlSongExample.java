package _19_string_regex.thuchanh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Mô tả
//Viết một ứng dụng cho phép xử lý mã HTML và lọc thông tin.
//Ứng dụng nhận vào URL của một trang web chứa danh sách các bài hát, phân tích mã
// HTML và hiển thị danh sách các bài hát có trong trang web đó..
//Sử dụng trang https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html để làm mẫu

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Kết quả chạy:
//Muộn Rồi Mà Sao Còn
//Sài Gòn Đau Lòng Quá
//Nàng Thơ
//Câu Hẹn Câu Thề
//Phận Duyên Lỡ Làng
//Níu Duyên
//Vách Ngọc Ngà
//Phải Chăng Em Đã Yêu?
//Anh Không Tha Thứ
//Chúng Ta Sau Này