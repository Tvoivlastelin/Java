package HWsem1;

//Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 7, 8, 4, 2, 1,9,0,999,-6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
