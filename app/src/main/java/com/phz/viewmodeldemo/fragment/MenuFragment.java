package com.phz.viewmodeldemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phz.viewmodeldemo.R;
import com.phz.viewmodeldemo.databinding.MenuFragmentBinding;
import com.phz.viewmodeldemo.util.FragmentNavigator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 菜单页
 * @author haizhuo
 */
public class MenuFragment extends Fragment {

    private MenuFragmentBinding mBinding;

    public static MenuFragment newInstance() {
        return new MenuFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.menu_fragment, container, false);
        mBinding=MenuFragmentBinding.bind(view);
        mBinding.setLifecycleOwner(this);
        mBinding.setMenuClickProxy(new ClickProxy());
        return view;
    }


    public class ClickProxy{
        public void toMyLiveDataViewModelFragment(){
            FragmentNavigator.getInstance().navigate(MenuFragment.this, LiveDataFragment.newInstance());
        }

        public void toMyObservableViewModelFragment(){
            FragmentNavigator.getInstance().navigate(MenuFragment.this, ObservableFragment.newInstance());
        }

        public void toMyObservableFieldViewModelFragment(){
            FragmentNavigator.getInstance().navigate(MenuFragment.this, ObservableFieldFragment.newInstance());
        }
    }
}
