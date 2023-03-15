package com.example.photoeditorpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class MainActivitty extends Activity {
    public CountDownTimer t_check_p;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);


        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
        this.t_check_p = new CountDownTimer(250, 1) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                if (ActivityCompat.checkSelfPermission(MainActivitty.this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    MainActivitty.this.t_check_p.start();
                    return;
                }
                MainActivitty.this.startActivity(new Intent(MainActivitty.this, EditActivity.class));
                System.exit(0);
            }
        }.start();
    }

    public void onBackPressed() {
        System.exit(0);
    }
}
