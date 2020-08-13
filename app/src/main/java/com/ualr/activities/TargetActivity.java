package com.ualr.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.ualr.activities.databinding.ActivityTargetBinding;

/**
 * Created by irconde on 2019-10-02.
 */
public class TargetActivity extends Activity {

    private ActivityTargetBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityTargetBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        // TODO 08. Uncomment this
        // mBinding.result.setText(String.format("%s is %d years old", p.getName(), p.getAge()));
    }
}
