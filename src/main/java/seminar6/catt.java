package seminar6;


public class catt {
    public static void main(String[] args) {
        Cat c1 = new Cat("Барсик", "blue", 5.66, 5);
        Cat c2 = new Cat("Бар", "ble", 56, 51);

        System.out.println(c2);
        c1.printName();

        boolean b = c1.equals(c2);
        System.out.println(c1);
        String fd = c1.toString();
        System.out.println(fd);
    }
}



