package HWsem1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class task3 {
    public static <DateTime> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        Date d = new Date();
//        System.out.printf(d.toString());
//        System.out.print('\n');
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm");
        System.out.println(formatForDateNow.format(d));
        String[] timef=formatForDateNow.format(d).split(":");
        int i = Integer.parseInt(timef[0]);
        if (i >= 5 & i < 12) {
            System.out.printf( "Доброе утро, "+name+"!");
        }
        else if (i >= 12 & i < 18) {
            System.out.printf( "Добрый день, "+name+"!");
        }
        else if (i >= 18 & i < 23) {
            System.out.printf( "Добрый вечер, "+name+"!");
        }
        else if (i >= 23 | i < 5) {
            System.out.printf( "Доброй ночи, "+name+"!");
        }
        in.close();
    }
}
