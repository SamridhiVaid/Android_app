package com.example.android.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.attendence.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent login = new Intent(MainActivity.this, com.example.android.attendance.login.class);
                startActivity(login);

            }

        });

        Button signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent signup = new Intent(MainActivity.this, Sign_Up.class);
                startActivity(signup);

            }

        });
    }
}
