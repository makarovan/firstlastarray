/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_last_arrays;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author estel
 */
public class First_last_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        //int number = random.nextInt(100);
        for (int i=0; i<numbers.length; i++){
        int number = random.nextInt(100);
         while (number%2 != 0){
            number = random.nextInt(100);
        }
        numbers[i] = number;
            //number = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] smallarray = new int[18];
        System.arraycopy(numbers, 1, smallarray, 0, 18);
        // 1 - номер числа с которого начать копирование
        // 0 - номер числа на которое начать копирование
        // 18 - сколько чисел скопировать
        System.out.println(Arrays.toString(smallarray));
        double sum = 0;
       
        for (int i=0; i<smallarray.length;i++){
            sum = sum+smallarray[i];
        }
        System.out.println(sum);
        double average = sum/smallarray.length;
        System.out.println(average);
    }
    
}
