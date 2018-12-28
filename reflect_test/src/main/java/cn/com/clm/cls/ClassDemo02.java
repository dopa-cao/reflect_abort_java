package cn.com.clm.cls;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class ClassDemo02 {
    public static void main(String []args) {
        Class c1 = int.class;//int的类类型
        Class c2 = String.class;//String的类类型（String的字节码）
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = float.class;
        Class c6 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getSimpleName());//不包含类名的类类型
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        System.out.println(c5.getName());
        System.out.println(c6.getName());
    }
}
