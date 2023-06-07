package HWsem1;

//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только
//        одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно
//        по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2],
//        …, [n][n];
public class task2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length-1; j >= 0; j--) {
                    arr[j][j] = 1;
                System.out.print(arr[i][j] + " ");
                }
            System.out.println();
            }
        System.out.print('\n');

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



