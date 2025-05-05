import java.util.Comparator;

/**
 * compares two students by their roll numbers
 */
public class RollNoComparator implements Comparator<Student> {

    /**
     * compares the roll numbers of two students
     *
     * @param s1 the first student to compare
     * @param s2 the second student to compare
     * @return negative if first roll number is less than second, zero if equal, positive if greater
     */
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}