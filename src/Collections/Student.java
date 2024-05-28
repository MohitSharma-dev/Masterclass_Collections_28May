package Collections;

public class Student implements Comparable<Student>{
    int age;
    String name;
    double percentage;

    Student(int age, String name, double percentage) {
        this.age = age;
        this.name = name;
        this.percentage = percentage;
    }

    // default/ natural ordering to the class
    // natural ordering : age desc
    public int compareTo(Student other) {
        // comparing two objects
        // this object vs other object
        // this object to come first => return -ve
        // other object to come first => return +ve
        if(this.age < other.age) {
            return 1;
        } else if(this.age > other.age) {
            return -1;
        }
        return 0;
    }
}
