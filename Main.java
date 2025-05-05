import java.util.ArrayList;
import java.util.List;

/**
 * demos student sorting using selection sort and comparators
 */
public class Main {
    /**
     * entry point; creates a list of students, sorts by name and roll number, and prints results
     *
     * @param args command-line arguments, not used
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(15, "david", "123 chestnut"));
        students.add(new Student(2, "anthony", "123 main"));
        students.add(new Student(14, "dave", "133 pine"));
        students.add(new Student(4, "tony", "124 main"));
        students.add(new Student(10, "bob", "135 main"));
        students.add(new Student(17, "sera", "123 walnut"));
        students.add(new Student(6, "aj", "125 main"));
        students.add(new Student(8, "ajc", "134 main"));
        students.add(new Student(11, "jim", "135 pine"));
        students.add(new Student(13, "james", "134 pine"));

        System.out.println("student list added below:\n");
        printStudentList(students);

        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nsorted by name\n");

        printStudentList(students);

        SelectionSort.selectionSort(students, new RollNoComparator());
        System.out.println("\nsorted by rollno\n");

        printStudentList(students);
    }

    private static void printStudentList(List<Student> list) {
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println(list.get(i));
        }
    }
}
