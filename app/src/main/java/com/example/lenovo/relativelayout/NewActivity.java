package com.example.lenovo.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        textView = findViewById(R.id.myTV);

        Intent intent = getIntent();
        String str = intent.getStringExtra("myString");

        textView.setText(str);
    }
}
