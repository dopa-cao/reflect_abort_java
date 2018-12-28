package cn.com.clm.meth;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class MethodDemo04 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
//        list1.add(12); //编译报错
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);

        /**
         * 反射是在编译之后进行的操作
         *
         * c1 == c2 说明编译之后是去泛型化的
         * java集合的泛型，是防止错误输入的，只在编译阶段有效
         * 通过反射绕过编译
         */
        try {
            Method m = c2.getMethod("add", Object.class);
            m.invoke(list1, 20);
            m.invoke(list1, 3f);
            m.invoke(list1, 4d);
            m.invoke(list1, true);
            System.out.println(list1.size());
            System.out.println(list1);

            // 运行报错：类型转换异常
//            for (String string : list1) {
//                System.out.print(string + " ");
//            }

            for (Object object : list1) {
                System.out.print(object + " ");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
