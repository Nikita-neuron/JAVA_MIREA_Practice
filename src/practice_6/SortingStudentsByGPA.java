package practice_6;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public boolean compareTo(Student o1, Student o2) {
        return o1.getGpa() < o2.getGpa();
    }
}
