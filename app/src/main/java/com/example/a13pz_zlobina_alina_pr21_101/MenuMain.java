package com.example.a13pz_zlobina_alina_pr21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuMain extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);
        ImageButton btn = findViewById(R.id.imageButton5);
        ImageView btn1 = findViewById(R.id.imageView6);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView4) {
            Intent intent = new Intent(this, MenuMenu.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageView6) {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageButton5) {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}