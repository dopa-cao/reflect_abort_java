package cn.com.clm.meth;

import cn.com.clm.meth.user.User;
import cn.com.clm.util.BeanUtil;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class MethodDemo03 {

    public static void main(String[] args) {
        User u1 = new User("张三", "123456", 28);

        System.out.println(BeanUtil.getValueByPropertyName(u1, "username")
        + " " + BeanUtil.getValueByPropertyName(u1, "userpass")
        + " " + BeanUtil.getValueByPropertyName(u1, "age"));

        BeanUtil.setValueByPropertyName(u1, "username","李四");
        BeanUtil.setValueByPropertyName(u1, "userpass","11221122");
        BeanUtil.setValueByPropertyName(u1, "age",18);

        System.out.println(BeanUtil.getValueByPropertyName(u1, "username")
                + " " + BeanUtil.getValueByPropertyName(u1, "userpass")
                + " " + BeanUtil.getValueByPropertyName(u1, "age"));

    }

}
