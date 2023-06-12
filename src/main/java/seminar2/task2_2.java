package seminar2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.
//
//        Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//        оно должно записаться в лог-файл.
public class task2_2 {
    public static void main(String[] args) {

            File file = new File("src/main/java/seminar2/text.txt");
            StringBuilder sb = new StringBuilder();
            sb.append("text".repeat(100));

            try (FileOutputStream fos = new FileOutputStream(file);
                 OutputStreamWriter osw = new OutputStreamWriter(fos,
                         StandardCharsets.UTF_8))
            {
                osw.write(String.valueOf(sb));
                System.out.println("Successfully written data to the file");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }
}
//import java.io.File;
//        import java.io.FileOutputStream;
//        import java.io.IOException;
//        import java.io.OutputStreamWriter;
//        import java.nio.charset.StandardCharsets;
//
//public class seminar2_1 {
//
//    public static void main(String[] args) {
//        File file = new File("test.txt");
//        StringBuilder text = createdString("test", 100);
//
//        String pathProject = System.getProperty("user.dir");
//        File dir = new File(pathProject);
//
//
//        System.out.println("Текущая папка");
//        System.out.println(pathProject);
//
//        try (FileOutputStream fos = new FileOutputStream(file);
//             OutputStreamWriter osw = new OutputStreamWriter(fos,
//                     StandardCharsets.UTF_8)) {
//
//            for (String fname : dir.list()) {
//                osw.write(String.valueOf(fname+"\n"));
//            }
//
//            System.out.println("Successfully written data to the file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static StringBuilder createdString(String str, int number) {
//        StringBuilder someStr = new StringBuilder();
//        for (int i = 0; i < number; i++) {
//            someStr.append(str);
//        }
//        return someStr;
//    }
//}