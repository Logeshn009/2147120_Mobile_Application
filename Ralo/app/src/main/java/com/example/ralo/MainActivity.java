package com.example.ralo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handSelection(View view) {
        Toast.makeText(this, "Tipu Sultan Palace", Toast.LENGTH_SHORT).show();
    }

    public void handSelection2(View view) {
        Toast.makeText(this, "Lal Bagh", Toast.LENGTH_SHORT).show();
    }

    public void handSelection3(View view) {
        Toast.makeText(this, "Cubbon Park", Toast.LENGTH_SHORT).show();
    }


    public void handSelection11(View view) {
        Toast.makeText(this, "JW Marriott Hotel", Toast.LENGTH_SHORT).show();
    }

    public void handSelection21(View view) {
        Toast.makeText(this, "ITC hotel", Toast.LENGTH_SHORT).show();
    }

    public void handSelection31(View view) {
        Toast.makeText(this, "Cubbon Park", Toast.LENGTH_SHORT).show();
    }

    public void handSelection4(View view) {
        Toast.makeText(this, "Cubbon Park", Toast.LENGTH_SHORT).show();
    }
}