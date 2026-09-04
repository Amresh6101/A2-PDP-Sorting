package customsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student1{
    int roll;
    String name;
    int age;

    public Student1() {
    }

    Student1(int roll, String name, int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class SortStudentByAge implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
public class TestComparator {
    public static void main(String[] args) {
        Student1 s1=new Student1(1,"amit",22);
        Student1 s2=new Student1(2,"harshit",43);
        Student1 s3=new Student1(4,"arab",32);
        Student1 s4=new Student1(7,"raghav",21);


        List<Student1> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("Before sorting..");
        System.out.println(list);
        list.sort(new SortStudentByAge());
        System.out.println("After sorting By Age ..");
        System.out.println(list);

    }
}
