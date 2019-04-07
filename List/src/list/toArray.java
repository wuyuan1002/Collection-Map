package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用Collection接口中的方法将集合转成数组
 *
 * 好处：集合转成数组，可以对集合中的元素操作的方法进行限定（不允许对其进行增删）
 *
 * @author wuyuan
 * @version 1.0
 * @date 2019/3/19 20:55
 */
public class toArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("asd1");
        list.add("asd2");
        list.add("asd3");
        list.add("asd4");
        list.add("asd5");

        String[] arr = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(arr));
    }
}
