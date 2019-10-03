package com.example.viewattributefun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = (Button) findViewById(R.id.buttonOn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText().toString().equals(getString(R.string.on))){
                    b.setText(getString(R.string.off));
                } else {
                    b.setText(getString(R.string.on));
                }
            }
        });
    }
}
