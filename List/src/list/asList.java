package list;

import java.util.Arrays;
import java.util.List;

/**
 * 使用Arrays将数组转成集合
 *
 * 好处：可以使用集合的方法操作数组了，
 *      但是数组的长度是固定的，所以涉及到改变元素个数的方法不能用，不能增删
 *
 * 注意：A.如果数组中存的是对象类型的数据，则转完后是将数组中的每一个对象作为元素存入集合中，
 *      数组有多长，集合就有多长
 *      B.如果数组中存的是基本数据类型，则转完后是将数组整个作为一个元素存入集合中，无论数组有多长，
 *      集合里都是只有一个元素，那就是那个数组。因为集合中不能存基本数据类型
 *      (Integer类型是对象类型不是基本数据类型)
 *
 *
 *
 * @author wuyuan
 * @version 1.0
 * @date 2019/3/19 20:29
 */
public class asList {
    public static void main(String[] args) {
        String[] string = {"haha", "xixi", "heihei", "hehe", "henhen"};

        //使用操作数组的类Arrays的asList()方法将数组转换成List集合
        List<String> list = Arrays.asList(string);

        //判断数组中是否含有xixi
        boolean b = list.contains("xixi");
        System.out.println(b == true ? "有" : "没有");

        //涉及到改变元素个数的方法不能用
//        list.add("asd");
    }
}
