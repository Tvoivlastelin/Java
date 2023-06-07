//package seminar1;
//
//import java.util.Arrays;
//
//public class MainForLessonOne {
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 1, 1, 0, 1, 1, 1};
//        int count = 0;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                count++;
//            } else if (count > max) {
//                max = count;
//                count = 0;
//            } else {
//                count = 0;
//            }
//        }
//        System.out.println(max);
//
//
//        String[] arr = new String[]{"flower", "flow", "flight"};
//        if (arr.length == 0) {
//            System.out.println("Массив пуст");
//
//        } else if (arr.length == 1) {
//            System.out.println(arr.length);
//        } else {
//
//            String rez = arr[0];
//            for (int i = 1; i < arr.length; i++) {
//                String cur = arr[i];
//                int reader = 0;
//                int lastCommon = 0;
//                while (reader < rez.length() && reader < cur.length()) {
//                    if (rez.charAt(reader) == cur.charAt(reader)) {
//                        lastCommon++;
//                    } else {
//                        break;
//                    }
//                    reader++;
//                }
//                rez = rez.substring(0, lastCommon);
//            }
//            System.out.println(rez);
//
//
//            String s = "Добро пожаловать на курс по Java";
//            String[] s1 = s.split("\\s+");
//            for (int i = 0; i < s1.length/2; i++) {
//                String tmp = s1[i];
//                s1[i]=s1[s1.length-1-i];
//                s1[s1.length-1-i]=tmp;
//            }
//            System.out.println(Arrays.toString(s1));
//        }
//    }
//}
//
//
//???
//        package Lesson_1;
//
//        import java.util.Arrays;
//
//public class MainClassForLessonOne {
//    public static void main(String[] args) {

//        int[] arr = new int[] {0,1, 1, 1, 1, 0, 1, 1, 1};
//        int count = 0;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                count++;
//            } else if (count > max) {
//                max = count;
//                count = 0;
//            } else {
//                count = 0;
//            }
//        }
//        System.out.println(max);

//        Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//        Если общего префикса нет, вернуть пустую строку "".

//        String[] array = new String[] {"uqwerty", "asdf", "qweyujk", "qwvbhjk", "qwerbjkl"};
//        char[] letter = new char[array.length];
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            letter[i] = array[i].charAt(count);
//        }
//
//        for (int i = 0; i < letter.length; i++) {
//            System.out.println(letter[i]);
//        }

//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

//         int[] nums = new int[] {3,2,3,2,3};
//         int val = 3;
//         int last = nums.length-1;
//         int temp = 0;
//         for (int i = nums.length-1; i >= 0; i--) {
//            if (nums[i] == val) {
//                temp = nums[i];
//                nums[i] = nums[last];
//                nums[last] = temp;
//                last--;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//
////    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//
//        String letter = "Добро пожаловать на курс по Java";
//        String[] letter2 = letter.split(" ");
//        String letter3 = "";
//        for (int i = 0; i < letter2.length; i++) {
//            letter3 += (letter2[letter2.length-i-1] + " ");
//        }
//
//        System.out.println(letter3);
//    }
//}