package com.phz.viewmodeldemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.phz.viewmodeldemo.R;
import com.phz.viewmodeldemo.bean.User;
import com.phz.viewmodeldemo.databinding.ViewModelFragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

/**
 * @author haizhuo
 */
public class LiveDataFragment extends Fragment {
    private ViewModelFragmentBinding mBinding;
    private LiveDataViewModel mViewModel;

    public static LiveDataFragment newInstance() {
        return new LiveDataFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel=ViewModelProviders.of(this).get(LiveDataViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.view_model_fragment, container, false);
        mBinding=ViewModelFragmentBinding.bind(view);
        mBinding.setLifecycleOwner(this);
        mBinding.setClickProxy(new ClickProxy());
        mBinding.setVm(mViewModel);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public class ClickProxy{
        public void nameChange(){
            User user=mViewModel.getMutableLiveData().getValue();
            user.setName("毛宁");
        }

        public void ageChange(){
            User user=mViewModel.getMutableLiveData().getValue();
            user.setAge(50);
        }

        public void msgChange(){
            User user=mViewModel.getMutableLiveData().getValue();
            user.setMsg("青青河边草");
        }

        public void msgVisibleChange(){
            mViewModel.getIsMsgShow().set(!mViewModel.getIsMsgShow().get());
        }

        public void showDoubleDataBindingResult(){
            //每次都能获取到最新的、由控件变化时自动推到状态变量的状态值
            Toast.makeText(getActivity().getApplicationContext(),
                    mViewModel.getMutableLiveData().getValue().getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}
