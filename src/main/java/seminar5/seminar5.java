package seminar5;

import java.util.Map;
import java.util.TreeMap;

//package seminar5;
//
//public class task {
//    public static void main(String[] args) {
//        class Solution {
//            public int romanToInt(String s) {
//                int number = 0;
//                int answer = 0;
//                int prev = 0;
//                for (int i = s.length() - 1; i >= 0; i--) {
//                    if (s.charAt(i) == 'I') {
//                        number = 1;
//                    } else if (s.charAt(i) == 'V') {
//                        number = 5;
//                    } else if (s.charAt(i) == 'X') {
//                        number = 10;
//                    } else if (s.charAt(i) == 'L') {
//                        number = 50;
//                    } else if (s.charAt(i) == 'C') {
//                        number = 100;
//                    } else if (s.charAt(i) == 'D') {
//                        number = 500;
//                    } else if (s.charAt(i) == 'M') {
//                        number = 1000;
//                    }
//                    if (number < prev) {
//                        answer -= number;
//                    } else {
//                        answer += number;
//                    }
//                    prev = number;
//                }
//                return answer;
//            }
//        }
//    }
//}
//
//    public int romanToInt(String s) {
//        int ans = 0, num = 0;
//        for (int i = s.length()-1; i >= 0; i--) {
//            switch(s.charAt(i)) {
//                case 'I': num = 1; break;
//                case 'V': num = 5; break;
//                case 'X': num = 10; break;
//                case 'L': num = 50; break;
//                case 'C': num = 100; break;
//                case 'D': num = 500; break;
//                case 'M': num = 1000; break;
//            }
//            if (4 * num < ans) ans -= num;
//            else ans += num;
//        }
//        return ans;
//    }
//
//    package lesson05;
//
//            import java.util.Map;
//
//public class Main02 {
//    public static void main(String[] args) {
//        Map<String, Integer> table = Map.of(
//                "I", 1,
//                "V", 5,
//                "X", 10,
//                "L", 50,
//                "C", 100,
//                "D", 500,
//                "M", 1000
//        );
////        System.out.println(table.get("I"));
//        String test = "MMMMCMXIX";
//
////        table.forEach((k, v) -> {
////
////            for (int i = 0; i < test.length(); i++) {
////                char ch = test.charAt(i);
////                String elem = Character.toString(ch);
//////                System.out.println(elem);
////                if (k.equals(elem)) {
//////                    System.out.println(v);
////                    sum += v;
////                }
////            }
////            System.out.println(sum);
////        });
//
////        System.out.println(table.keySet());
////        for (String s : table.keySet()) {
////            System.out.println(table.get(s));
////
////        }
////        int sum = 0;
////        for (int i = 0; i < test.length() - 1; i++) {
////
//////          System.out.println(elem);
////
////            if (test.charAt(i+1)>test.charAt(i)) {
////                char ch = test.charAt(i);
////                String elem = Character.toString(ch);
////                int res =table.get(elem);
////
////            }
////            sum+=res;
////
////        }
//
////        System.out.println(sum);
//
//
//    }
//}
//
//    private static Integer ex3(String romanNum) {
//
//        Map<Character, Integer> romanToDecimalMap = Map.of(
//                'I', 1,
//                'V', 5,
//                'X', 10,
//                'L', 50,
//                'C', 100,
//                'D', 500,
//                'M', 1000
//        );
//
//        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
//        int decimalNum = 0;
//        int prevNum = -1;
//
//        for (Character romanChar : romanNumSB.toString().toCharArray()) {
//            int currentNum = romanToDecimalMap.get(romanChar);
//            if (currentNum < prevNum) {
//                currentNum *= -1;
//            }
//            decimalNum += currentNum;
//            prevNum = currentNum;
//        }
//
//        return decimalNum;
//
//    }
public class seminar5 {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        Map<String, String> employeeMap = new TreeMap<>();
        employeeMap.put("1234", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3434", "Романцев");
        employeeMap.put("5467", "Князев");

        System.out.println(employeeMap);

        /*Set<String> keySet = employeeMap.keySet();
        System.out.println(keySet);*/

/*        for (String key : employeeMap.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, employeeMap.get(key));
        }*/

        /*Set<Map.Entry<String,String>> entrySet = employeeMap.entrySet();
        System.out.println(entrySet);*/

        /*for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
        }*/

        employeeMap.forEach((key, value) -> System.out.printf("%s\t->\t%s%n", key, value));

        Map<Integer, String> testMap = Map.of(
                12, "A",
                47, "B",
                7, "C"
        );

        Map<Integer, String> testMap2 = Map.ofEntries(
                Map.entry(12, "A"),
                Map.entry(47, "B"),
                Map.entry(7, "C")
        );

//        testMap.put(5, "f");
    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }

        return decimalNum;

    }
}

