package practice_6;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Student[] students1 = new Student[2];
        Student[] students2 = new Student[1];
        students1[0] = new Student(3, "Ivan", "Petrov", 100, "ИКБО-39-19");
        students1[1] = new Student(2, "Maxim", "Ivanov", 80, "ИКБО-40-19");

        students2[0] = new Student(1, "Dmitri", "Belov", 100, "ИКБО-41-19");

        Student[] result = mergeSort(students1, students2);

        System.out.println(Arrays.toString(result));
    }

    public static Student[] mergeSort(Student[] array1, Student[] array2) {
        Student[] array = new Student[array1.length + array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];
        }
        sortArray(array, array.length);
        return array;
    }

    public static void sortArray(Student[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[n - mid];

        System.arraycopy(array, 0, left, 0, mid);
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        sortArray(left, mid);
        sortArray(right, n - mid);

        merge(array, left, right, mid, n - mid);
    }
    public static void merge(Student[] array, Student[] leftA, Student[] rightA, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftA[i].getiDNumber() <= rightA[j].getiDNumber()) {
                array[k++] = leftA[i++];
            }
            else {
                array[k++] = rightA[j++];
            }
        }
        while (i < left) {
            array[k++] = leftA[i++];
        }
        while (j < right) {
            array[k++] = rightA[j++];
        }
    }
}
