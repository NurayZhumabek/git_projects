package TestArray;

import java.util.Arrays;

public class arrayTest {
    public static void main(String[] args) {

        //Найдите элемент массива, который делит массив на две части таким образом, что сумма элементов влево от него равна сумме элементов справа от него.
        middleItem(new int[]{1, 3, 5, 2, 5, 1, 2, 3});

        //Дан массив чисел. Найдите самую длинную подпоследовательность, в которой все числа идут по возрастанию.
        subsequence(new int[]{1, 2, 3, 1, 2, 3, 4, 5});

        //Переместить все нули в конец массива, сохраняя порядок остальных элементов.
        sortWithoutZero(new int[]{0, 1, 9, 0, 3, 12, 0});

        //Наибольшая сумма подпоследовательности: Найти подмассив с наибольшей суммой в массиве целых чисел.
        maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        // Циклический сдвиг массива: Реализовать функцию, которая будет циклически сдвигать массив на n позиций вправ
        arrayShift(new int[]{1, 2, 3, 4, 5}, 2);

        //Удаление дубликатов из отсортированного массива: Реализовать функцию, которая удаляет все дубликаты из отсортированного массива и возвращает новую длину массива.
        removeDuplicate(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8});
    }

    static void middleItem(int[] nums) {
        //Найдите элемент массива, который делит массив на две части таким образом, что сумма элементов влево от него равна сумме элементов справа от него.
        int item = 0;
        int sumL = 0;
        int sumR = 0;
        String res = "";
        for (int j = 0; j < nums.length; j++) {
            item = j;
            sumL = 0;
            sumR = 0;

            for (int k = 0; k <= item; k++) {
                sumL += nums[k];
            }
            for (int k = item + 1; k < nums.length; k++) {
                sumR += nums[k];

            }
            if (sumL == sumR) {
                res = "Item:" + nums[item];
                System.out.println("\n" + res);
            }
        }
    }

    static void subsequence(int[] nums) {
        int length = 1;
        int maxCount = 0;
        String res = "";
        int start = 0;
        for (int j = 0; j < nums.length; j++) {
            length = 1;

            for (int k = j + 1; k < nums.length; k++) {
                if (nums[k] - nums[k - 1] == 1) {
                    length++;
                } else {
                    break;
                }
            }
            if (length > maxCount) {
                start = j;
                maxCount = length;

            }
        }
        System.out.println("Длина самой длинной подпоследовательности по возраcтанию: " + maxCount);
        for (int i = start; i < maxCount + start; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


    static void sortWithoutZero(int[] nums) {
        //Переместить все нули в конец массива, сохраняя порядок остальных элементов.
        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[j] == 0 && nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + "\t");
        }
        System.out.println();
    }

    static void addSubArray(int[] nums) {
        //Наибольшая сумма подпоследовательности: Найти подмассив с наибольшей суммой в массиве целых чисел.
        int sum = 0;
        int maxSum = 0;
      
        for (int j = 0; j < nums.length; j++) {
            sum = 0;
            for (int k = j; k < nums.length; k++) {

                sum += nums[k];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        System.out.println("Наибольшая сумма подмассива: " + maxSum);
    }

    static void arrayShift(int[] array, int step) {
        int[] newArray = new int[array.length];
        // Циклический сдвиг массива: Реализовать функцию, которая будет циклически сдвигать массив на n позиций вправ
        for (int i = 0; i < array.length; i++) {

            int position = (i + step) % array.length;
            int temp = array[i];
            newArray[position] = temp;

        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    static void removeDuplicate(int[] array) {
        //Удаление дубликатов из отсортированного массива: Реализовать функцию, которая удаляет все дубликаты из отсортированного массива и возвращает новую длину массива.
        int length = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                length++;
            }
        }
        System.out.println(length);
        int[] newArray = new int[array.length - length];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                int temp = array[i];
                newArray[index] = temp;

                index++;
            }
        }
        for (int i : newArray) {
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();


    }
    static void maxSubArray(int[] nums) {
        int maxSum = 0;
        int[] maxSubArray = new int[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currentSum = 0;
                int[] currentSubArray = new int[j - i + 1];
                int index = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += nums[k];
                    currentSubArray[index] = nums[k];
                    index++;
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSubArray = currentSubArray;
                }
            }
        }
        System.out.println(Arrays.toString(maxSubArray) + " с суммой " + maxSum);
    }
}



