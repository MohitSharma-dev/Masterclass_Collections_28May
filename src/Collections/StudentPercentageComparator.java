package Collections;

import java.util.Comparator;

// asc order of percentage
public class StudentPercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // if o1 to win : return -1
        // if o2 to win : return 1
        // equal : return 0

        if(o1.percentage < o2.percentage){
            // o1 object to come first
            return -1;
        } else if(o1.percentage > o2.percentage){
            // o2 to comes first in the answer
            return 1;
        }
        return 0;
    }
}
