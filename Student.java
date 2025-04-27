public class Student{
    private int rollno;
    private String name;
    private String addr;

    public Student(int rollno, String name, String addr){
        this.rollno = rollno;
        this.name = name;
        this.addr = addr;
    }

    public int getRollNo(){
        return rollno;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return addr;
    }
    @Override
    public String toString(){
        return "Student \n" + "Roll Number: " +rollno + "\nName: " + name 
            + "\nAddress: " + addr;
    }

}