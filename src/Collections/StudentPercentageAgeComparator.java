package Collections;

import java.util.Comparator;

public class StudentPercentageAgeComparator implements Comparator<Student> {
    // desc order of percentage
    // if equal younger one should come first
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.percentage > o2.percentage){
            return -1;
        } else if (o1.percentage < o2.percentage){
            return 1;
        } else {
            if(o1.age > o2.age){
                return 1;
            } else if (o1.age < o2.age){
                return -1;
            }
        }
        return 0;
    }
}
