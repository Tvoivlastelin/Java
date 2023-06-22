package HWsem5;

import java.util.*;

//Реализовать консольное приложение - телефонный справочник.
//        У одной фамилии может быть несколько номеров.
//        Пользователь может вводить команды:
//        1: ADD Ivanov 88005553535 - добавить в справочник новое значение.
//        Первый аргумент - фамилия, второй - номер телефона
//        2: GET Ivanov - получить список всех номеров по фамилии
//        3: REMOVE Ivanov - удалить все номера по фамилии
//        4: LIST - Посмотреть все записи
//        5: EXIT - Завершить программу
//
//        Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
//        .
//
//        Пример взаимодействия (=> - это вывод на консоль):
//        ADD Ivanov 8 800 555 35 35
//        ADD Ivanov 8 800 100 10 10
//        GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
//        ADD Petrov 8 555 12 34
//        LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
//        REMOVE Ivanov
//        LIST => Petrov = [8 555 12 34]
//        GET NoName => Не найдена запись с фамилией "NoName"
//        REMOVE NoName => Не найдена запись с фамилией "NoName"3
public class PhoneBook{
     Map <String,List<String>> phoneBook = new HashMap<>();

    public void add (String lastName,String phoneNumber){
        List<String> list =phoneBook.getOrDefault(lastName,new ArrayList<>());
        list.add(phoneNumber);
        phoneBook.put(lastName,list);
    }
    public List<String> get(String lastName){
        List<String> list = phoneBook.getOrDefault(lastName,null);
        if (list==null){
            System.out.println("Не найдена запись с фамилией \""+ lastName+ "\"");
        } else {
            System.out.println(lastName+" = "+list);
        }
        return list;
    }
    public void remove(String lastName){
        if (!phoneBook.containsKey(lastName)){
            System.out.println("Не найдена запись с фамилией \""+ lastName+ "\"");
            return;
        }
        phoneBook.remove(lastName);
    }
    public void list (){
        for(Map.Entry<String,List<String>>entry:phoneBook.entrySet()){
            System.out.print(entry.getKey()+ "=");
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

                while (true) {
                String command = scanner.nextLine().trim();
                String [] arguments = command.split(" ");

                if (arguments[0].equalsIgnoreCase("ADD")){
                        phoneBook.add(arguments[1], arguments[2]);
                }else if (arguments[0].equalsIgnoreCase("GET")){
                phoneBook.get(arguments[1]);
                } else if (arguments[0].equalsIgnoreCase("REMOVE")){
                phoneBook.remove(arguments[1]);
                } else if (arguments[0].equalsIgnoreCase("LIST")){
                phoneBook.list();
                } else if (arguments[0].equalsIgnoreCase("EXIT")){
                    System.out.println("Программа завершена");
                    break;
                } else {
                System.out.println("Неверная команда");
                }
            }
        }
    }

