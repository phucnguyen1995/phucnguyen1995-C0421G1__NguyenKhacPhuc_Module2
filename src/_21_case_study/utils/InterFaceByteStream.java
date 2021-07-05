package _21_case_study.utils;

import java.io.File;
import java.util.List;

public interface InterFaceByteStream<T> {
    List<T> readFileByteStream(String path);

    void writeFileByteStream(List<T> ts, String path);
    void clearData(String path);
}
