package com.phz.viewmodeldemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.phz.viewmodeldemo.R;
import com.phz.viewmodeldemo.databinding.ObservableFragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class ObservableFragment extends Fragment {
    private ObservableFragmentBinding mBinding;
    private ObservableViewModel mViewModel;

    public static ObservableFragment newInstance() {
        return new ObservableFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel=ViewModelProviders.of(this).get(ObservableViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.observable_fragment, container, false);
        mBinding=ObservableFragmentBinding.bind(view);
        mBinding.setLifecycleOwner(this);
        mBinding.setVm(mViewModel);
        mBinding.setClickProxy(new ClickProxy());
        return view;
    }

    public class ClickProxy{
        public void nameChange(){
            mViewModel.getUser().setName("紫色老太婆");
        }

        public void ageChange(){
            mViewModel.getUser().setAge(17);
        }

        public void msgChange(){
            mViewModel.getUser().setMsg("星星眨着眼");
        }

        public void msgVisibleChange(){
            mViewModel.getIsMsgShow().set(!mViewModel.getIsMsgShow().get());
        }

        public void showDoubleDataBindingResult(){
            //每次都能获取到最新的、由控件变化时自动推到状态变量的状态值
            Toast.makeText(getActivity().getApplicationContext(), mViewModel.getUser().getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}
