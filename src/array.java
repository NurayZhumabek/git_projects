public class array {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};


// вывести первые 3 элемента массива
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
// вывести первую половину массива
        for (int i = 0; i < nums.length / 2; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        // вывести вторую половину массива
        for (int i = nums.length / 2; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
// вывести все элементы кроме первого и последнего
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
// вывести последние 3 элемента
        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        // вывести четные эементы по порядку
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1)
                System.out.println(nums[i]);
        }
        System.out.println();
        // вывести кол-во положительных и отрицательных элементов
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                count++;
            else
                count2++;
        }
        System.out.println("Кол-во положительных элементов:" + count);
        System.out.println("Кол-во отрицательных элементов:" + count2);
//вывести мах и мин элемент в массиве
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        System.out.println("Максимальный элемент:" + max);
        System.out.println("Минималный элемент:" + min);
    }
}
