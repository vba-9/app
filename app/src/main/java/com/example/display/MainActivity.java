package com.example.display;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mytext;
    Button  mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=(TextView)findViewById(R.id.tid);
        mybutton=(Button)findViewById(R.id.bid);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mytext.setText("Hello sdsd sdsd sddsd ssd ");
            }
        });
    }
}