import java.util.Comparator;

/**
 * compares two students by their names in a case-insensitive way
 */
public class NameComparator implements Comparator<Student> {
    /**
     * compares the names of two students, ignoring case differences
     *
     * @param s1 the first student to compare
     * @param s2 the second student to compare
     * @return negative if first name comes before second, zero if equal, positive if after
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
