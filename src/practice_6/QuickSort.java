package practice_6;

import java.util.Arrays;

public class QuickSort{
    private static SortingStudentsByGPA comparator;
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(3, "Ivan", "Petrov", 100, "ИКБО-39-19");
        students[1] = new Student(2, "Maxim", "Ivanov", 80, "ИКБО-40-19");
        students[2] = new Student(1, "Dmitri", "Belov", 100, "ИКБО-41-19");

        comparator = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1);

        System.out.println(Arrays.toString(students));
    }

    public static void quickSort(Student[] list, int low, int high) {
        int leftMarker = low;
        int rightMarker = high;
        Student student = list[(leftMarker + rightMarker) / 2];
        do {
            while (list[leftMarker].getGpa() > student.getGpa()) leftMarker++;
            while (comparator.compareTo(list[rightMarker], student)) rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = list[leftMarker];
                    list[leftMarker] = list[rightMarker];
                    list[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < high) {
            quickSort(list, leftMarker, high);
        }
        if (low < rightMarker) {
            quickSort(list, low, rightMarker);
        }
    }
}
