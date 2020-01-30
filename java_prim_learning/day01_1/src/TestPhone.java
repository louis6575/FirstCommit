/**
 * @Description: 测试自定义类
 * 实现引用类型的步骤：
 *     1.导入包，类在同一文件夹下，则不需要导入包
 *     2.创建引用类型
 *     3.变量.类型中的功能属性等
 * @Author: Kris
 * Date: 2020/1/29 14:58
 */
public class TestPhone {
    public static void main(String[] args){
        // 创建引用类型变量
        Phone p = new Phone();
        // 定义变量属性
        p.color = "玫瑰红";
        p.brand = "华为";
        p.size = 6;

        // 获取属性值
        System.out.println(p.color+" "+p.brand+ " "+p.size);
    }
}
