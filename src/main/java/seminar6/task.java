package seminar6;
import java.util.*;
//public class task {


////  1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000.
////  2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
////  уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
////  Для вычисления процента используйте формулу:
////  процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
//
//        public static void main(String[] args) {
//            int len = 1000;
//            List<Integer> numbers = createList(len);
//            Set<Integer> setNumbers = new HashSet<>(numbers);
//
//        System.out.println(numbers);
////        int a = 10;
////        int b = 20;
////        var c = (double) a/b;
////        System.out.println(c);
//            System.out.println(chackPracentege(numbers,setNumbers) + "%");
//
//        }
//        public static List<Integer> createList(int len){
//            List<Integer> numbers = new ArrayList<>();
//            Random rnd = new Random();
//            for (int i = 0; i < len; i++) {
//                numbers.add(rnd.nextInt(0, 1000));
//            }
//            return numbers;
//        }
//        public static double chackPracentege(List<Integer> numbers, Set<Integer> setNumbers){
//            int a = numbers.size();
//            int b = setNumbers.size();
//            double c = (double) b/a;
//            return  c * 100;
//        }
//    }
//
