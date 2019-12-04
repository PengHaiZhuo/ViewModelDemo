package com.phz.viewmodeldemo;

import android.os.Bundle;

import com.phz.viewmodeldemo.fragment.MenuFragment;
import com.phz.viewmodeldemo.util.FragmentNavigator;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author haizhuo
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentNavigator.getInstance().init(this,R.id.fragment_container);
        FragmentNavigator.getInstance().loadRootFragment(MenuFragment.newInstance());
    }
}
