package cn.com.clm.cls;

import cn.com.clm.util.ClassUtil;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class ClassDemo03 {
    public static void main(String []args) {
        String s = "hello";
        ClassUtil.printClassMethod(s);
        System.out.println("=================================");


        int n = 1;
        ClassUtil.printFieldMessage(n);
        System.out.println("=================================");


        float f = 1f;
        ClassUtil.printConMessage(f);



    }
}
