package cn.com.clm.cls;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class ClassDemo01 {

    public static void main(String[] args){
        //People类的实例对象表示
        People people = new People();
        //People也是一个实例对象，是Class的实例对象
        //任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        //1.任何一个类都有一个隐含的静态成员变量class
        Class c1 = People.class;

        //2.已知类的对象获取该类
        Class c2 = people.getClass();

        /**
         * 官网说明：c1和c2都表示了People类的类类型（class type）
         * 万物皆对象 （静态的成员 和 基本数据类型除外）
         * 类也是对象，是Class的实例对象，这个对象称之为该类的类类型
         */

        //不管c1 或 c2都代表了People的类类型，一个类只可能是Class的一个实例对象
        System.out.println(c1 == c2);

        //3.动态加载类
        Class c3 = null;
        try {
            c3 = Class.forName("cn.com.clm.cls.People");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);

        //完全可以通过类的类类型创建该类的对象类型
        try {
            People p = (People)c1.newInstance();
            p.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}

