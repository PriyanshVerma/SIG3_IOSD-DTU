package com.example.lenovo.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText); ////important, else null-pointer exception!
    }

    public void showToast(View view) {

        String str = "ABC";

        Toast.makeText(this, "Button " + str +  " Clicked", Toast.LENGTH_SHORT).show();

    }

    public void changeActivity(View view) {

        String name = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,NewActivity.class);
        intent.putExtra("myString", name);

        startActivity(intent);

    }
}
