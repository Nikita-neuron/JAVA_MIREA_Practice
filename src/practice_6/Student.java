package practice_6;

public class Student {
    private int iDNumber;
    private String name;
    private String surname;
    private int gpa;
    private String group;

    public Student(int iDNumber, String name, String surname, int gpa, String group) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
        this.group = group;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                ", group='" + group + '\'' +
                '}';
    }
}
