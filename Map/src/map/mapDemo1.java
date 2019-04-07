package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 需求：遍历map集合的所有元素
 *
 * @author wuyuan
 * @version 1.0
 * @date 2019/3/17 18:34
 */
public class mapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>(5);
        map.put(5,"vavsfdvb");
        map.put(3,"abvsdf");
        map.put(1,"qow");
        map.put(2,"avfdv");
        map.put(4,"WEFAFVB");

        method_1(map);
        method_2(map);
    }

    public static void method_1(Map<Integer,String> map){
        /*
         * 先通过keySet方法获得每一个键的set集合，再通过set集合获得每一个值
         */
        Set<Integer> keys = map.keySet();

        /*
         * 通过迭代器遍历set
         */
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

        /*
         * 通过foreach循环遍历set
         */
        for (Integer key : keys) {
            System.out.println(key+"---"+map.get(key));
        }
    }
    public static void method_2(Map<Integer,String> map){
        /*
         * 通过map的entrySet方法获得存储每一个键值对的set集合,然后通过set获取每一个键值对
         */
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        /*
         * 通过迭代器遍历set
         */
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }

        /*
         * 通过foreach循环遍历set
         */
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"==="+value);
        }

    }
}
