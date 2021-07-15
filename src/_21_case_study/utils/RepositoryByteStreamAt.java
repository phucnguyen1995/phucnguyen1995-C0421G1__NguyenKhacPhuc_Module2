package _21_case_study.utils;

import java.util.Collection;

public interface RepositoryByteStreamAt<T> {
    void writeFile(String path, Collection<T> collection);
    Collection<T> readFile(String path);
    void clearData(String path);
}
