package com.phz.viewmodeldemo.fragment;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.ViewModel;

public class ObservableFieldViewModel extends ViewModel {
    private ObservableField<String> name=new ObservableField<>();
    private ObservableInt age=new ObservableInt();
    private ObservableField<String> msg=new ObservableField<>();
    private ObservableBoolean isShowMsg=new ObservableBoolean();
    {
        name.set("重庆小面");
        age.set(18);
        msg.set("二两多加辣，多要葱");
        isShowMsg.set(true);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public ObservableInt getAge() {
        return age;
    }

    public ObservableField<String> getMsg() {
        return msg;
    }

    public ObservableBoolean getIsShowMsg() {
        return isShowMsg;
    }
}
