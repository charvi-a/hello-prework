package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.red));
            }
        });
        findViewById(R.id.backgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Hello from Charvi!");
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.light_blue));
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.dark_purple));
            }
        });

        findViewById(R.id.ownTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entered_text = ((EditText)findViewById(R.id.editText)).getText().toString();
                if (entered_text.isEmpty()){
                    ((TextView)findViewById(R.id.text)).setText("Enter text!");
                }else {
                    ((TextView) findViewById(R.id.text)).setText(entered_text);
                }
            }
        });
    }
}