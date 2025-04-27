import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student(15, "David", "123 chestnut"));
        students.add(new Student(2, "Anthony", "123 main"));
        students.add(new Student(14, "Dave", "133 pine"));
        students.add(new Student(4, "Tony", "124 main"));
        students.add(new Student(10, "Bob", "135 main"));
        students.add(new Student(17, "Sera", "123 walnut"));
        students.add(new Student(6, "AJ", "125 main"));
        students.add(new Student(8, "AJC", "134 main"));
        students.add(new Student(11, "Jim", "135 pine"));
        students.add(new Student(13, "James", "134 pine"));

        System.out.println("Student list added below:\n");
        printStudentList(students);

        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nSorted by name\n");

        printStudentList(students);

        SelectionSort.selectionSort(students, new RollNoComparator());
        System.out.println("\nSorted by rollno\n");

        printStudentList(students);
    }

    private static void printStudentList(List<Student> list){
        int listSize = list.size();
        for(int i = 0; i < listSize; i ++){
            System.out.println(list.get(i));
        }
    }
}