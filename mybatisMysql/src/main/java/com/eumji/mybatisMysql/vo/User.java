package com.eumji.mybatisMysql.vo;

/**
 * @author Do
 * @package com.eumji.mybatisMysql.vo
 * @name User
 * @date 2017/3/27
 * @time 21:13
 */
public class User {
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
