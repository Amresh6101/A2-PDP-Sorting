package customsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int roll;
    String name;
    int age;

    public Student() {
    }

    Student(int roll, String name, int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.name.length(),o.name.length());
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

public class TestComparable {
    public static void main(String[] args) {
        Student s1=new Student(1,"amit",22);
        Student s2=new Student(2,"harshit",43);
        Student s3=new Student(4,"arab",32);
        Student s4=new Student(7,"raghav",21);


        List<Student> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("Before sorting..");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting..");
        System.out.println(list);
    }

}
