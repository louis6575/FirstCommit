/**
 * @Description: 综合练习题
 * @Author: Kris
 * Date: 2020/1/29 15:59
 */
public class PracticeDemo {
    public static void main(String[] args){
//        // 求和：1+3+5+7+...+99
//        sumOdd();
//
//        // 计算求出水仙花数，如：153 = 1*1*1 + 5*5*5 + 3*3*3
//        numOfDaffodils();
//
//        // 打印9*9乘法表
//        jiuJiuMultiTable(9);
//
//        // 数组的逆序
//        int[] arr = {1,2,3,4,5};
//        arrayReverseOrder(arr);
//        printArray(arr);
//
//        // 选择排序算法
//        int[] arr = {6,2,5,4,8};
//        selectSort(arr);
//        printArray(arr);
//
//        // 冒泡排序算法
//        int[] arr1 = {6,2,5,4,8};
//
//        bubbleSort(arr1);
//        printArray(arr1);

        // 折半查找算法
        int[] arr2 = {6,2,5,4,1,7,8};
        bubbleSort(arr2);
        printArray(arr2);
        int index = binarySearch(arr2,6);
        System.out.println("折半查找结果为："+index);
    }

    private static int binarySearch(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;

        while(min <= max){
            mid = (min + max)/ 2;
            if(value > arr[mid]){
                min = mid +1;
            }
            else if(value<arr[mid]){
                mid = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    private static void bubbleSort(int [] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("\b]");
    }

    private static void selectSort(int [] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void arrayReverseOrder(int [] arr) {

        int temp = 0;
        for(int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    private static void jiuJiuMultiTable(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    private static void numOfDaffodils() {
        int bai = 0;
        int shi = 0;
        int ge = 0;

        System.out.println(">> 水仙花数：");
        for(int i = 100; i < 1000; i++){
            bai = i / 100;
            shi = i % 100 / 10;
            ge = i % 10;

            if(i == bai*bai*bai + shi*shi*shi +ge*ge*ge){
                System.out.println(i);
            }
        }

    }

    private static void sumOdd() {
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 1; i < 100; i++){
            if(i % 2 != 0){
                sum += i;
            }
            count1++;
        }
        System.out.println("1+3+5+7+...+99="+sum);
        System.out.println(">> 循环执行次数："+count1);

        sum = 0;
        for(int i = 0; 2 * i + 1 < 100; i++){
            sum += 2 * i + 1;
            count2++;
        }
        System.out.println("1+3+5+7+...+99="+sum);
        System.out.println(">> 循环执行次数："+count2);

        sum = 0;
        for(int i = 1; i < 100; i += 2){
            sum += i;
            count3++;
        }
        System.out.println("1+3+5+7+...+99="+sum);
        System.out.println(">> 循环执行次数："+count2);

    }
}
