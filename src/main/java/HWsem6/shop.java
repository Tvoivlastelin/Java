package HWsem6;

import javax.lang.model.element.VariableElement;
import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class shop {
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("DELL", "black", 15.5, 1590, 256, 8));
        notebooks.add(new Notebook("APPlE", "green", 21.5, 1900.5, 512, 16));
        notebooks.add(new Notebook("ASUS", "black", 19.5, 1290, 128, 4));
        notebooks.add(new Notebook("ASER", "pink", 16.5, 1190.6, 256, 8));
        notebooks.add(new Notebook("HUAWEi", "black", 13.5, 1390, 512, 4));
        notebooks.add(new Notebook("LENOVO", "white", 14.5, 1500, 256, 2));

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название ноутбука или Enter, если не знаете этот параметр");
            String nameNotebook = scanner.nextLine();
            System.out.println("Введите цвет ноутбука или Enter, если не знаете этот параметр");
            String colorNotebook = scanner.nextLine();
            System.out.println("Введите диагональ ноутбука или цифру 0, если не знаете этот параметр");
            Double diagNotebook = Double.valueOf(scanner.nextLine());
            if (diagNotebook>=0){
                System.out.println("Введите цену ноутбука или цифру 0, если не знаете этот параметр");
            }
            Double priceNotebook = Double.valueOf(scanner.nextLine());
            if (priceNotebook >=0){
                System.out.println("Введите SSD ноутбука или цифру 0, если не знаете этот параметр");
            }
            int ssdNotebook = Integer.parseInt(scanner.nextLine());
            if (ssdNotebook >=0){
                System.out.println("Введите RAM ноутбука или цифру 0, если не знаете этот параметр");
            }
            int ramNotebook = Integer.parseInt(scanner.nextLine());


            for (Notebook notebook : notebooks) {
                if (notebook.getName().equalsIgnoreCase(nameNotebook) || notebook.getColor().equalsIgnoreCase(colorNotebook)
                        || notebook.getSSD() == ssdNotebook || notebook.getRAM() == ramNotebook
                        || notebook.getPrice() <= priceNotebook || notebook.getDiagonal() <= diagNotebook) {
                    System.out.println(notebook);
                }
            }

        } catch (NumberFormatException ignored) {

        }
    }
}




