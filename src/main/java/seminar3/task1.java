//package seminar3;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class task1 {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(0,9);
//        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
////        System.out.println(list);
//    }
//}
//
//    private static void ex0() {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s6);
//        System.out.println("---");
//        System.out.println(s1.equals(s5));
//        System.out.println(s1.equalsIgnoreCase(s5));
//        System.out.println(Objects.equals(s1, s5));
//    }
//
//    private static void listTest() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(0,9);
//        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
////        System.out.println(list);
////        Integer[] ints = (Integer[]) list.toArray();
//        Integer[] ints2 = list.toArray(new Integer[]{});
//        test(1, 2, 5, 7, 8, 4);
//    }
//
//    static void test(Integer... arr) {
//        for (Integer integer : arr) {
//            System.out.println("value: " + integer);
//        }
//    }
//
//    private static void ex1() {
//        Random random = new Random();
//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            integers.add(random.nextInt(100)); //0-99
//        }
//
////        integers.sort(Comparator.naturalOrder());
//        Collections.sort(integers, Comparator.reverseOrder());
//
//        System.out.println(integers);
//    }
//
//    import java.util.ArrayList;
//            import java.util.List;
//            import java.util.Random;
//
//public class task1 {
//    public static void main(String[] args) {
////        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. V
////        Вывести название каждой планеты и количество его повторений в списке.
//
//        List<String> planets = List.of("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluton");
//        List<String> planetList = createRandom(planets, 100);
////        System.out.println(planetList);
//        countPlanets(planetList);
//    }
//    public static List<String> createRandom(List<String> planets, int len){
//        List<String> newList = new ArrayList<String>();
//        Random rnd = new Random();
//        for (int i = 0; i < len; i++) {
//            newList.add(planets.get(rnd.nextInt(0,8)));
//        }
//        return newList;
//    }
//    public static void countPlanets(List<String> planets){
//        List<String> newList = new ArrayList<String>();
//        newList.add(planets.get(0));
//        boolean flag = true;
//        for (int i = 0; i < planets.size(); i++) {
//            for (int j = 0; j < newList.size(); j++) {
//                if(newList.get(j).equals(planets.get(i))){
//                    flag = false;
//                }
//            }
//            if(flag) { newList.add(planets.get(i)); }
//            flag = true;
//        }
//        System.out.println(planets);
//        System.out.println(newList);
//        for (int i = 0; i < newList.size(); i++) {
//            String temp = newList.get(i);
//            int count = 0;
//            for (int j = 0; j < planets.size(); j++) {
//                if(temp.equals(planets.get(j))){
//                    count++;
//                }
//            }
//            System.out.println(temp + " : " + count);
//        }
//    }
//}
//    Import java.util.*;
//
//public class task1 {
//    public static void main(String[] args) {
////        Создать список типа ArrayList<String>.
////        Поместить в него как строки, так и целые числа.
////        Пройти по списку, найти и удалить целые числа.
//        List<String> arrList = new ArrayList<String>();
//        Collections.addAll(arrList, "1","a","3","gre");
//        System.out.println(arrList);
//        System.out.println(arrList.get(0).);
//    }
//    public static List<String> removeDigits(List<String> arrList){
//        for (int i = 0; i < arrList.size(); i++) {
//
//        }
//        return arrList;
//    }
//}
//    int x = Integer.parseInt("9");
//import javax.imageio.IIOException;
//        import java.io.IOException;
//        import java.util.*;
//
//public class taskThree {
//    public static void main(String[] args) {
////        Создать список типа ArrayList<String>.
////        Поместить в него как строки, так и целые числа.
////        Пройти по списку, найти и удалить целые числа.
//        List<String> arrList = new ArrayList<String>();
//        Collections.addAll(arrList, "1","a","3","gre");
//        System.out.println(arrList);
////        System.out.println(arrList.get(0).);
//        Integer a = Integer.parseInt(arrList.get(0));
//        System.out.println(a.getClass().getName());
////        int x = Integer.parseInt("9");
//        System.out.println(removeDigits(arrList));
//    }
//    public static List<String> removeDigits(List<String> arrList){
//        for (int i = 0; i < arrList.size(); i++) {
//            try {
//                Integer a = Integer.parseInt(arrList.get(i));
//                arrList.remove(i);
//            }
//            catch(Exception e){
//                continue;
//            }
//        }
//        return arrList;
//    }
//}