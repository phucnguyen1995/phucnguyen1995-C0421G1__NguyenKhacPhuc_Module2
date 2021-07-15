package _23_thi.utils;

import java.util.List;

public interface RepositoryByteStream<T> {
    List<T> readFileByteStream(String path);
    void writeFileByteStream(List<T> tenList, String path);
}
