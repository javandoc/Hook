package com.guagua.hookactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.tvText)).setText("mainActivity");


    }

    public void start(View view) {
        startActivity(new Intent(this, MainActivity3.class));
    }
}
