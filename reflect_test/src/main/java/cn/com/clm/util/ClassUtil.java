package cn.com.clm.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class ClassUtil {

    /**
     * 打印类的信息
     *
     * @param obj   类的对象
     */
    public static void printClassMethod(Object obj) {
        Class c = obj.getClass();
        System.out.println("class name：" + c.getName());


        /**
         * getMethods 获取所有的public的函数，包括继承父类而来的
         * getDeclaredMethods 获取所有该类自己声明的方法
         */
        Method[] methods = c.getMethods();
        for (Method ms : methods) {
            Class returnType = ms.getReturnType();
            // 获取返回值类型的类类型
            System.out.print(returnType.getName() + " ");
            // 获取方法名称
            System.out.print(ms.getName() + "(");
            // 获取参数类型 --> 得到的是参数列表类型的类类型
            Class[] parameterTypes = ms.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                String temp = i == parameterTypes.length -1 ? "" : ",";
                System.out.print(parameterTypes[i].getName() + temp);
            }
            System.out.println(")");
        }
    }

    /**
     * 获取成员变量的信息
     *
     * @param obj   类的对象
     */
    public static void printFieldMessage(Object obj) {
        Class c = obj.getClass();
        /**
         * 成员变量也是对象
         * java.lang.reflect.Field
         * Field类封装了关于成员变量的操作
         * getFields获取所有的public的成员变量信息
         * getDeclaredFields获取该类自己声明的成员变量的信息
         */
//        Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            //获取成员变量的信息
            String fieldName = field.getName();
            System.out.println(fieldType + " " + fieldName);
        }

    }

    public static void printConMessage(Object obj) {
        Class c = obj.getClass();
        /**
         * 构造函数也是对象
         * java.lang.Constructor中封装了构造函数的信息
         * getConstructors获取所有的public的构造函数
         * getDeclaredConstructors获取所有的构造函数
         */
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            System.out.print(constructor.getName() + "(");
            Class[] parTypes = constructor.getParameterTypes();
            for (int i = 0; i < parTypes.length; i++) {
                String temp = i == parTypes.length - 1 ? "" : ",";
                System.out.print(parTypes[i].getTypeName() + " " + parTypes[i].getName() + temp);
            }
            System.out.println(")");

        }
    }
}






















