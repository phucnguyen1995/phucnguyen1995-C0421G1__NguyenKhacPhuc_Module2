package _12_java_collection_framework.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainth3 {
    public static void main(String[] args) {
        Studentth3 student = new Studentth3("Kien", 30, "HT");
        Studentth3 student1 = new Studentth3("Nam", 26, "HN");
        Studentth3 student2 = new Studentth3("Anh", 38, "HT" );
        Studentth3 student3 = new Studentth3("Tung", 38, "HT" );

        List<Studentth3> lists = new ArrayList<Studentth3>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Studentth3 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Studentth3 st : lists){
            System.out.println(st.toString());
        }
    }
}
