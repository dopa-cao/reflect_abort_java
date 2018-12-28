package cn.com.clm.meth;

import cn.com.clm.meth.user.UserService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class MethodDemo02 {

    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("请输入命令：");
            String action = br.readLine();

            /*if ("update".equals(action)) {
                us.update();
            } else if ("delete".equals(action)) {
                us.delete();
            } else if ("find".equals(action)) {
                us.find();
            }*/

            Class c = us.getClass();
            Method m = c.getMethod(action);
            m.invoke(us);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
