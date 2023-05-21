package com.example.a13pz_zlobina_alina_pr21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    @Override
    public void onClick(View v) {
         if (v.getId() == R.id.imageButton3)
        {
            Intent intent1 = new Intent(this, MenuMain.class);
            startActivity(intent1);
        }

        else if (v.getId() == R.id.textView12) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageButton2)
            {
                Intent intent2 = new Intent(this, MenuMenu.class);
                startActivity(intent2);
            }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Вы и так находитесь здесь!", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}