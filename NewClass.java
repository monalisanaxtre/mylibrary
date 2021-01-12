package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class NewClass {
    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}

