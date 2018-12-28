package cn.com.clm.util;

import java.lang.reflect.Method;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class BeanUtil {

    /**
     * 执行get方法
     *
     * @param obj       对象
     * @param property  属性
     * @return          result
     */
    public static Object getValueByPropertyName(Object obj, String property) {

        //1.根据属性获取其get方法
        String getMethodName = "get"
                + property.substring(0, 1).toUpperCase()
                + property.substring(1);

        //2.获取方法对象
        Class c = obj.getClass();
        try {
            // get方法是public且无参数
            Method method = c.getMethod(getMethodName);

            // 3.通过方法的反射操作方法
            Object result = method.invoke(obj);

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    /**
     * 执行set方法
     * @param obj       对象
     * @param property  属性
     * @param temp      要set的值
     */
    public static void setValueByPropertyName(Object obj, String property, Object temp) {

        //1.根据属性获取其set方法
        String setMethodName = "set"
                + property.substring(0, 1).toUpperCase()
                + property.substring(1);

        //2.获取方法对象
        Class c = obj.getClass();
        try {
            // set方法是public且参数是temp
            Method method = c.getMethod(setMethodName, temp.getClass());

            // 3.通过方法的反射操作方法
            method.invoke(obj, temp);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
