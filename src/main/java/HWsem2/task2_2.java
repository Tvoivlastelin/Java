package HWsem2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//) Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.


public class task2_2 {

    private static final Logger logger = Logger.getLogger(task2_2.class.getName());
    public static void main(String[] args) {
        int [] arr = {3,2,5,4,1,9,6,8};
        logger.log(Level.INFO,"Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            logger.log(Level.INFO,"Итерация " + (i+1) + ":" + Arrays.toString(arr));
        }
        logger.log(Level.INFO,"Отсортированный массив " + Arrays.toString(arr));

    }
}