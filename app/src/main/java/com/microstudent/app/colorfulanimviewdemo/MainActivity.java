package com.microstudent.app.colorfulanimviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.microstudent.app.colorfulanimview.ColorfulAnimView;

public class MainActivity extends AppCompatActivity {
    private ColorfulAnimView animView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animView = (ColorfulAnimView) findViewById(R.id.anim_view);
    }

    public void startAnim(View view) {
        animView.startAnim();
    }

    public void showDialog(View view) {
        AnimProgressDialog dialog = new AnimProgressDialog(this);
        dialog.show();
    }
}
