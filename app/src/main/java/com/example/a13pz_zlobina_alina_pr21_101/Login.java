package com.example.a13pz_zlobina_alina_pr21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textView4) {
            Intent intent = new Intent(this, Registr.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.button2) {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.button3) {
            Intent intent = new Intent(this, MenuMain.class);
            startActivity(intent);
        }
            else {
                Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }