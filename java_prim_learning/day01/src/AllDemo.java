import java.util.Random;
import java.util.Scanner;

/**
 * @Description: 格式： 数据类型 变量名 = new 数据类型()
 * @Author: Kris
 * Date: 2020/1/29 12:06
 */
public class AllDemo {
    public static void main(String[] args){
//        // ScannerDemo()键盘输入
//        ScannerDemo();
//
//        // RandomDemo()随机输入
//        int bound = 100;
//        RandomDemo(bound);
//
//        // IfDemo()选择语句
//        IfDemo();
//
//        // WhileDemo()循环语句
//        WhileDemo();
//
//        // ForDemo()循环语句
//        ForDemo();
//
//        // SumByForDemo()求和
//        SumByForDemo();
//
//        // DoWhileDemo()会无条件执行一次
//        DoWhileDemo();
//
//        // ForForDemo()嵌套循环
//        ForForDemo();
//
//        // BreakDemo()循环终止
//        BreakDemo();
//
//        // ContinueDemo()结束本次循环，进行下次循环
//        ContinueDemo();
//
//        // SwitchDemo()流程控制语句--选择语句 当前版本可接受的数据类型有 byte short int char enum(枚举) String
//        SwitchDemo();
//
//        // ArrayDemo()数组
//        ArrayDemo();
//
//        // AArrayDemo()数组
//        AArrayDemo();
//
//        // CallName()小案例：随机点名器
//        CallName();
//
        /**
         * 方法重载的注意事项:
         *     1.参数列表必须不同
         *     2.重载和参数变量名无关
         *     3.重载和返回值类型无关
         *     4.重载和修饰符无关
         * 技巧：重载看方法名和参数列表
         */
//        // MethodOverLoadDemo()方法重载

//        MethodOverLoadDemo();
    }

    private static void MethodOverLoadDemo() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"+"+b+"="+getSum(a,b));

        double d = sc.nextDouble();
        double e = sc.nextDouble();
        System.out.println(d+"+"+e+"="+getSum(d,e));

        int c = sc.nextInt();
        System.out.println(a+"+"+b+"+"+c+"="+getSum(a,b,c));

    }

    private static int getSum(int a, int b) {
        System.out.println("两个int参数求和");
        return a+b;
    }

    private static double getSum(double a, double b) {
        System.out.println("两个double参数求和");
        return a+b;
    }

    private static int getSum(int a, int b, int c) {
        System.out.println("三个int参数求和");
        return a+b+c;
    }


    private static void CallName() {
        // 定义数组
        String [] names = {"张三","李四","爱丽丝","马克","汤姆","杰瑞","泰菲"};
        // 遍历数组
        System.out.println(">> 数组遍历开始：");
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println("\n>> 数组遍历完成！");
        // 随机器
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        System.out.println(">> 随机点名： "+names[index]);
    }

    private static void AArrayDemo() {
//        int [][] arr = new int [3][4];
        int [][] arr = {{1,2,3},{4,5},{6,7,8,9},{0}};
    }

    private static void ArrayDemo() {
        int[] arr = new int[]{0,1,2};
        System.out.println(arr.length);

        int[] arr0 = {1,2,3,4,5};
        for(int i = 0; i < arr0.length; i++){
            System.out.print(arr0[i]+" ");
        }
    }

    private static void SwitchDemo() {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("INPUT ERROR!");
        }
    }

    private static void ContinueDemo() {
        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                System.out.println("结束本次循环代号："+i);
                continue;
            }
            System.out.println("正常循环语句块代号："+i);
        }
    }

    private static void ScannerDemo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        System.out.println("输入的整数为"+i);
    }

    private static void RandomDemo(int bound){
        Random ran = new Random();
        int i = ran.nextInt(bound);
        System.out.println("随机数为："+i);
    }

    private static void IfDemo(){
        int i = 5;
        if(i>3){
            System.out.println("True");
        }
        else System.out.println("False");
    }

    private static void WhileDemo(){
        int i = 1;
        while (i < 5){
            System.out.println("WhileDemoTest"+i);
            i++;
        }
    }

    private static void ForDemo(){
        for(int i = 0; i < 5; i++){
            System.out.println("ForDemoTest"+i);
        }
    }

    private static void SumByForDemo(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("1+2+3+...+100="+sum);
    }

    private static void DoWhileDemo(){
        int i = 0;
        do{
            System.out.println("DoWhileDemoTest"+i);
            i++;
        }while(i < 5);
    }

    private static void ForForDemo(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("ForForDemoTest("+i+","+j+") ");
            }
            System.out.println();
        }
    }

    private static void BreakDemo(){
        int i = 1;
        while(true){
            if(i == 3){
                System.out.println("终止循环，i="+i);
                break;
            }
            i++;
        }
    }
}
