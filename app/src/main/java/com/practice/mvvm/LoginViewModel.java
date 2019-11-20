package com.practice.mvvm;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {


    private LoginContract contract;
    public String uname = null;
    public String upassword = null;


    LoginViewModel(LoginContract contract) {
        this.contract = contract;
    }

    public void loginnow(View view) {

        if (!uname.isEmpty() || !upassword.isEmpty()) {
            contract.onSuccess("Login Sucess");

        } else {
            contract.onFailure("Login Failed");
        }


    }
}
