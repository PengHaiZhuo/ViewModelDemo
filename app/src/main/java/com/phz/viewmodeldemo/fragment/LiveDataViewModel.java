package com.phz.viewmodeldemo.fragment;

import com.phz.viewmodeldemo.bean.User;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author haizhuo
 */
public class LiveDataViewModel extends ViewModel {
    private MutableLiveData<User> mutableLiveData;

    /**
     * 是否显示
     */
    private ObservableBoolean isMsgShow = new ObservableBoolean();

    {
        isMsgShow.set(true);
    }

    public MutableLiveData<User> getMutableLiveData() {
        if (mutableLiveData == null) {
            mutableLiveData=new MutableLiveData<>();
            //给他个默认的值
            User user=new User("卢本伟",21,"29杀吃鸡前无古人后无来者");
            mutableLiveData.setValue(user);
        }
        return mutableLiveData;
    }

    public ObservableBoolean getIsMsgShow() {
        return isMsgShow;
    }
}
