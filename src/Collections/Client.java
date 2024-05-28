package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Collection

        // List : Ordered collection : insertion order
        // allows duplicate elements
        // index to manipulate the data

        // array , growable / dynamic
        // not thread safe : not synchronized
        // random access : index : O(1)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // linked list is used for implementation
        // Doubly LL
        // random is access in not O(1)
        // not thread safe
        // insertion and removal
        List<Integer> list1 = new LinkedList<>();
        // Arraylist + thread safety
        // concurrent package : offers you a lot of alternative which are thread safe
        List<Integer> list2 = new Vector<>();

        // LIFO : Last In first out
        // push , pop , peek
        // Stack extends Vector
        // thread safe
        List<Integer> list3 = new Stack<>();


        // Set : no duplicate elements , faster search : avg O(1)
        // Hashing techniques are used to make this search faster
        // ordered ? not ordered generally , there are some specific sets which are ordered

        // not ordered at all, random order
        // avg : O(1)
        Set<Integer> set = new HashSet<>();
        // preserves the insertion order
        // DLL (maintains insertion order)   +   hashmap (searching faster)
        Set<Integer> set1 = new LinkedHashSet<>();
        // sorted order : natural ordering
        // BBST : Balanced Binary Search Trees : uses RED Black Trees , AVL trees are also BBST
        // searching , insertion : O(log2n)
        Set<Integer> set2 = new TreeSet<>();

        set.add(5);
        set.add(16);
        set.add(2);
        set.add(8);
        set.add(4);

        set1.add(5);
        set1.add(16);
        set1.add(2);
        set1.add(8);
        set1.add(4);

        set2.add(5);
        set2.add(16);
        set2.add(2);
        set2.add(8);
        set2.add(4);

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);

        // Queue : data structure which holds the elements before processing
        // Deque : Double ended queue : insertion and removal from both the ends
        Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> q = new PriorityQueue<>();
        // change the order of removal using comparators
        q.add(5);
        q.add(16);
        q.add(2);
        q.add(8);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student(25 , "Mohit" , 50));
        students.add(new Student(21 , "Nishant" , 24));
        students.add(new Student(32 , "ABC" , 100));

        Collections.sort(students);

        for(Student student : students){
            System.out.println(student.name);
        }

        Collections.sort(students , new StudentPercentageComparator());

        for(Student student : students){
            System.out.println(student.name);
        }

        Collections.sort(students, new StudentPercentageAgeComparator());
    }
}
