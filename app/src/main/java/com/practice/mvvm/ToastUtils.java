package com.practice.mvvm;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void ShowToast(Context context, String message, int duration) {
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
