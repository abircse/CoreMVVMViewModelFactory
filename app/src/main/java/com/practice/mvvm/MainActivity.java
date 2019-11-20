package com.practice.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.practice.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LoginContract{

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        LoginViewModel viewModel = ViewModelProviders.of(this,new LoginViewModelFactory(this)).get(LoginViewModel.class);
        binding.setViewmodel(viewModel);
    }



    @Override
    public void onSuccess(String message) {
        ToastUtils.ShowToast(this,message,0);
    }

    @Override
    public void onFailure(String message) {
        ToastUtils.ShowToast(this,message,0);
    }
}
