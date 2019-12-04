package com.phz.viewmodeldemo.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * @author 彭海卓 on 2019/12/4
 * @introduction 用户bean
 */
public class User extends BaseObservable {
    private String name;
    private int age;
    private String msg;

    public User(String name, int age, String msg) {
        this.name = name;
        this.age = age;
        this.msg = msg;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.phz.viewmodeldemo.BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.phz.viewmodeldemo.BR.age);
    }

    @Bindable
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyPropertyChanged(com.phz.viewmodeldemo.BR.msg);
    }
}
