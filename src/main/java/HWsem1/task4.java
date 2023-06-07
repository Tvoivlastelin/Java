package HWsem1;

import java.util.Arrays;
import java.util.Scanner;

// Написать метод, которому на вход подается одномерный массив и число n
//         (может быть положительным, или отрицательным), при этом метод
//         должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
//         Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//         Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//         при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
//         можете выбирать сами.
public class task4 {
    public static void main(String[] args) {
        int[] array = new int [] { 6, 4, 7, 8 };
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        Integer n = Integer.valueOf(in.nextLine());
        in.close();
        System.out.println("Array "+Arrays.toString(array));
        ShiftToRight(array,n);
    }

    public static void ShiftToRight(int a[],int n){
        int temp = a[n];
        for (int i = n; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
        System.out.println("Array after shifting to right by one : "+ Arrays.toString(a));
    }
}

