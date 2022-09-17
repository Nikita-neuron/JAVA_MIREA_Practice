package practice_6;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(3, "Ivan", "Petrov", 100, "ИКБО-39-19");
        students[1] = new Student(2, "Maxim", "Ivanov", 80, "ИКБО-40-19");
        students[2] = new Student(1, "Dmitri", "Belov", 100, "ИКБО-41-19");

        for (int i = 0; i < students.length; i++) {
            int j = i - 1;
            Student student = students[i];
            while (j >= 0 && students[j].getiDNumber() > student.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = student;
        }

        System.out.println(Arrays.toString(students));
    }
}
