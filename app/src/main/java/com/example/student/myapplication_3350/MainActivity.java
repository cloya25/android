package com.example.student.myapplication_3350;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView val;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val = (TextView) findViewById(R.id.id1);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                val.setText("Cesar");
                button = (Button) v;
                Toast.makeText(getApplicationContext(),"This is a toast message", Toast.LENGTH_LONG).show();
            }
        });
    }
}
