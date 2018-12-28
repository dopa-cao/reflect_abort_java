package cn.com.clm.meth;

import java.lang.reflect.Method;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        // 1.要获取 print(int,int) 方法 --> 就要获取类的信息 --> 首先获取类的类类型
        A a1 = new A();
        Class c = a1.getClass();

        /**
         * 2.获取方法 名称 参数来决定
         * getMethod获取public的方法
         * getDeclaredMethod获取自己声明的方法
         */
        try {

//            a1.print(10, 2);

//            Method m = c.getMethod("print", new Class[]{int.class, int.class});
            Method m = c.getMethod("print", int.class, int.class);

            //方法反射的基本操作

            //用m对象来进行方法的调用 和 a1.print调用的效果完全相同
            // 方法如果没有返回值返回null,有返回值返回具体的返回值
//            Object o = m.invoke(a1, new Object[]{10, 2});
            Object o = m.invoke(a1, 10, 2);


            Method m1 = c.getMethod("print", String.class, String.class);
            o = m1.invoke(a1, "hello", "WORLD");


            Method m2 = c.getMethod("print");
            m2.invoke(a1);




        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
