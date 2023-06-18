package HWsem4;

import java.util.*;

//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была
//        первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//        > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//        > java
//        > python
//        > c#
//        > print
//< [c#, python, java]
//        > revert
//        > print
//< [python, java]
//        > revert
//        > revert
//        > print
//< []
//        > revert -> throw new NoSuchElementException
public class task4_1 {
    public static void main(String[] args) {
        Deque<String> storage = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if ("exit".equals(command)) {
                break;
            }
            storage.addFirst(command);

            if ("print".equals(command)) {
                storage.removeFirst();
                System.out.println(storage);
            }
           try {
               if ("revert".equals(command)) {
                   storage.removeFirst();
                   storage.removeFirst();
               }
            } catch (NoSuchElementException e) {
                System.err.println("revert -> throw new NoSuchElementException");
            }
        }
        System.out.println("Программа завершена");
    }
}

