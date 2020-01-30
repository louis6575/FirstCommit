import java.util.ArrayList;

/**
 * @Description: ArrayList集合的使用
 * @Author: Kris
 * Date: 2020/1/29 15:11
 */
public class ArrayListDemo {
    public static void main(String[] args){
        // 创建集合容器，指定存储的数据类型
        // 存储字符串
        ArrayList<String> array = new ArrayList<String>();
        // 存储整数
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        //存储Phone类型
        ArrayList<Phone> array2 = new ArrayList<Phone>();

        // add方法
        array.add("I");
        array.add("love");
        array.add("Java");
        array.add("!");
        // 指定位置插入元素
        array.add(1,"do");
        // 集合的遍历
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i)+" ");
        }
        //size方法
        int size = array.size();
        System.out.println("\n"+size);
        // get方法，根据索引获取数据
        String s = array.get(1);
        System.out.println(s);
        // set方法修改指定元素
        array.set(4, ".");
        // 集合的遍历
        for (String value : array) {
            System.out.print(value + " ");
        }

    }
}
