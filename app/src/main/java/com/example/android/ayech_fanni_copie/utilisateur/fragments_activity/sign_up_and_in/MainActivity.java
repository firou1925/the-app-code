package com.example.android.ayech_fanni_copie.utilisateur.fragments_activity.sign_up_and_in;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.ayech_fanni_copie.R;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        btnSignIn = (Button) findViewById(R.id.button);
        btnSignUp=(Button)findViewById(R.id.button2);
// Set OnClick Listener on SignUp button
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
/// Create Intent for SignUpActivity abd Start The Activity
                Intent intentSignUP=new Intent(getApplicationContext(),Signup.class);
                startActivity(intentSignUP);
            }
        });
    }
}
