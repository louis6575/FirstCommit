import java.util.ArrayList;

/**
 * @Description:
 * @Author: Kris
 * Date: 2020/1/29 15:37
 */
public class ArrayListForPhoneDemo {
    public static void main(String[] args){
        ArrayList<Phone> alp = new ArrayList<Phone>();
        add(alp);
        for(int i = 0; i < alp.size(); i++){
            System.out.println(alp.get(i).brand+" "+alp.get(i).color+" "+alp.get(i).size);
        }
    }

    private static void add(ArrayList<Phone> alp) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        Phone p4 = new Phone();
        Phone p5 = new Phone();

        p1.brand = "华为";
        p1.color = "幽兰";
        p1.size = 6.2;
        p2.brand = "苹果";
        p2.color = "优雅粉";
        p2.size = 6.0;
        p3.brand = "小米";
        p3.color = "玫瑰红";
        p3.size = 5.6;
        p4.brand = "一加";
        p4.color = "黑金";
        p4.size = 6.1;
        p5.brand = "VIVO";
        p5.color = "酒红";
        p5.size = 6.0;

        alp.add(p1);
        alp.add(p2);
        alp.add(p3);
        alp.add(p4);
        alp.add(p5);
    }


}
