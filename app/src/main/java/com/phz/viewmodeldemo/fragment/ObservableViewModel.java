package com.phz.viewmodeldemo.fragment;

import com.phz.viewmodeldemo.bean.User;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

public class ObservableViewModel extends ViewModel {
    private User user = new User("小红", 15, "峡谷之巅王者");

    /**
     * 是否显示
     */
    private ObservableBoolean isMsgShow = new ObservableBoolean();

    {
        isMsgShow.set(false);
    }

    public User getUser() {
        return user;
    }

    public ObservableBoolean getIsMsgShow() {
        return isMsgShow;
    }
}
