package com.cheng.mvpframestudy.themvp.model.bean;

import com.cheng.mvpframestudy.themvp.frame.model.IModel;

/**
 * @author kymjs (http://www.kymjs.com/) on 10/26/15.
 */
public class User implements IModel {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}