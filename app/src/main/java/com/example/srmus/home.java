package com.example.srmus;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private ImageView imageView2;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);  // Ensure the layout file name is correct

        imageView2 = findViewById(R.id.imageView2);
        imageButton = findViewById(R.id.imageButton);

        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(home.this, "Awards SRM Achieved", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        // Set click listener for the imageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open AboutSRM activity when the ImageButton is clicked
                Intent intent = new Intent(home.this, aboutsrm.class);
                startActivity(intent);
            }
        });
    }
}
