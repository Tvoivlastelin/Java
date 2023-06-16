package HWsem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа
public class Task3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println(integers);
        System.out.println("max = " + max(integers));
        System.out.println("min = " + min(integers));
        System.out.println("среднеарифметическое равно = " + sred_arif(integers));
        System.out.println("массив без четных числе -> " + del_chet(integers));
    }
    public static int max (List<Integer> integers){
        int maxi=0;
        for (Integer integer : integers) {
            if (integer > maxi) {
                maxi = integer;
            }
        }
        return maxi;
    }
    public static int min (List<Integer> integers) {
        int mini = integers.get(0);
        for (Integer integer : integers) {
            if (integer < mini) {
                mini = integer;
            }
        }
        return mini;
    }
    public static int sred_arif (List<Integer> integers) {
        int sred = 0;
        for (Integer integer : integers) {
            sred = sred + integer;
        }
        return sred;
        }
    public static List<Integer> del_chet(List<Integer> integers) {
        List <Integer> newList = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 != 0) {
                newList.add(integer);
            }
        }
        return newList;
    }
}





