package com.example.nechaev_v_26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextbtn2 = (Button)findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

}
