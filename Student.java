/**
 * represents a student with a roll number, name, and address.
 */
public class Student {
    private int rollno;
    private String name;
    private String addr;

    /**
     * constructs a new student.
     *
     * @param rollno the roll number of the student; must be non-negative
     * @param name the name of the student; must not be null
     * @param addr the address of the student; must not be null
     * @throws IllegalArgumentException if rollno is negative or name or addr is null
     */
    public Student(int rollno, String name, String addr) {
        if (rollno < 0) {
            throw new IllegalArgumentException("Roll number cannot be negative");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (addr == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.rollno = rollno;
        this.name = name;
        this.addr = addr;
    }

    /**
     * gets the roll number of the student.
     *
     * @return the roll number
     */
    public int getRollNo() {
        return rollno;
    }

    /**
     * gets the name of the student.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the address of the student.
     *
     * @return the address
     */
    public String getAddress() {
        return addr;
    }

    /**
     * returns a string representation of the student.
     *
     * @return a formatted string with student details
     */
    @Override
    public String toString() {
        return "Student \n" +
               "Roll Number: " + rollno + "\n" +
               "Name: " + name + "\n" +
               "Address: " + addr;
    }
}
