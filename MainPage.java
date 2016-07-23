package com.example.annwags.monkeybusiness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.content.Intent;

public class MainPage extends AppCompatActivity {

    Button myButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        myButton = (Button)findViewById(R.id.button)
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(v.getContext(), SecondPage.class);
                startActivity(myIntent);
            }
        }
    }
}
