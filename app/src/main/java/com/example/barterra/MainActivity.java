package com.example.barterra;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.barterra.data.model.LoggedInUser;
import com.example.barterra.ui.login.LoginActivity;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Button logInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**imageButton = (ImageButton) findViewById(R.id.mainPageButton);
         imageButton.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v)
        {
        openActivity2();
        }
        });**/

        logInButton = (Button) findViewById(R.id.loginButton);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
        /**public void openActivity2()
         {
         Intent intent = new Intent(this, Main2Activity.class);
         startActivity(intent);
         }**/
    }

        public void openLoginPage ()
        {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

}
