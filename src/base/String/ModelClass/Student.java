package base.String.ModelClass;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017-07-06.
 */
public class Student implements Comparable<Student> {

    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int compareTo(Student o) {
        if (o.getScore() > this.score) {
            return -1;
        } else if (o.getScore() < this.score) {
            return 1;
        } else {
            return 0;
        }
    }

}

class test{
    public static void main(String[] args) {
//        Student t1 = new Student("czming",100);
//        Student t2 = new Student("my",120);
//        Student t3 = new Student("yyf",130);
//        Student t4 = new Student("psw",150);
//        TreeMap map = new TreeMap();
//        TreeMap map1;
//        map.put(t1,t1);
//        map.put(t2,t2);
//        map.put(t3,t3);
//        map.put(t4,t4);
//        map1 = (TreeMap) map.subMap(t1,t3);
//        System.out.println(map1.toString());
// creating maps
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        SortedMap<Integer, String> treemapincl = new TreeMap<Integer, String>();

        // populating tree map
        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(5, "five");

        System.out.println("Getting a portion of the map");
        treemapincl=treemap.subMap(1,5);
        System.out.println("Sub map values: "+treemapincl);
    }

}
