package map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 需求:计算字符串中每个字母出现的次数
 *
 * @author wuyuan
 * @version 1.0
 * @date 2019/3/20 9:27
 */
public class mapDemo2 {
    public static void main(String[] args) {
        String str = "ak[jc b./cbadk,.b24ACad ak452sabc akADVjd678kabcLL;;[]kAD2Vjd[,abak24jbDGH3Dkjacb";

        String s = getCharCount(str);
        System.out.println(s);

//        Map<String,String> map = new HashMap<>();//map键如果相同会覆盖前面的
//        map.put("a", "aa");
//        map.put("b", "bb");
//        map.put("a", "cc");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        Set<String> set = new HashSet<>();//set村相同元素时不存而不是覆盖
//        set.add("a");
//        set.add("b");
//        set.add("a");
//        for (String s : set) {
//            System.out.println(s);
//        }

    }

    private static String getCharCount(String str) {
        //将字符串转换成字符数组
        char[] chs = str.toCharArray();
        //创建一个treemap集合用来存储每个字母以及他们出现的次数,因为用treemap可以对字母进行自然排序
        Map<Character, Integer> map = new TreeMap<>();

        for (char ch : chs) {
            Integer value = map.get(ch);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (value == null) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, ++value);
                }
            }
        }
        return map.toString();
    }
}

