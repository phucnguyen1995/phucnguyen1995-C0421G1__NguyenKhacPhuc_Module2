package _12_java_collection_framework.thuchanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<Studentth3> {
    @Override
    public int compare(Studentth3 o1, Studentth3 o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge().equals(o2.getAge())){
            return 0;
        }else{
            return -1;
        }

    }
}
