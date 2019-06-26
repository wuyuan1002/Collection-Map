package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 将list集合转换成线程安全的
 *
 *
 * @author wuyuan
 * @version 1.0
 * @date 2019/3/19 20:03
 */
public class listDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("asadcs");
        list.add("asadcdsavs");
        list.add("DVSADcs");
        list.add("VFDSTRNYTcs");
        list.add("asbgfnhf");
        list.add("asad4335gcs");

        //使用Collections的方法将list转换成线程安全的
        List<String> synchronizedList = Collections.synchronizedList(list);

        System.out.println(synchronizedList);
    }
}
