package cn.com.clm.meth.user;

/**
 * describe:
 *
 * @author liming.cao@hand-china.com
 */
public class User {
    private String username;
    private String userpass;
    private Integer age;

    public User() {
    }

    public User(String username, String userpass, int age) {
        this.username = username;
        this.userpass = userpass;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
