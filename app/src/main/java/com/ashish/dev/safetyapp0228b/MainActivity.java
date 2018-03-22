package com.ashish.dev.safetyapp0228b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1b; //btnUserLogin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        btn1b = (Button) findViewById(R.id.btn1);
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserLoginScr();
            }
        });
    }

    public void openUserLoginScr(){
        Intent intent1 = new Intent(MainActivity.this, UserLoginScr.class);
        startActivity(intent1);
    }

}
