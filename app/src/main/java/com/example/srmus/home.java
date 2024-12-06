package com.example.srmus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private ImageView imageView2;
    private ImageButton imageButton;
    private ImageSwitcher imageSwitcher;
    private int[] imageResources = {
            R.drawable.ig_clr, // Replace with your actual image resource names
            R.drawable.twitter_clr,
            R.drawable.facebook_clr,
            R.drawable.linked_clr,
            R.drawable.srmlogo
    };
    private int currentImageIndex = 0;
    private Handler imageSwitcherHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Ensure the layout file name is correct

        imageView2 = findViewById(R.id.imageView2);
        imageButton = findViewById(R.id.imageButton);
        imageSwitcher = findViewById(R.id.imageSwitcher);

        // Initialize ImageSwitcher
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(home.this);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            }
        });

        // Start the ImageSwitcher
        startImageSwitcher();

        // Set touch listener for the second image view
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

        // Set click listener for the ImageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open AboutSRM activity when the ImageButton is clicked
                Intent intent = new Intent(home.this, aboutsrm.class);
                startActivity(intent);
            }
        });
    }

    private void startImageSwitcher() {
        // Display the first image
        imageSwitcher.setImageResource(imageResources[currentImageIndex]);

        // Schedule automatic image changes
        imageSwitcherHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                currentImageIndex = (currentImageIndex + 1) % imageResources.length;
                imageSwitcher.setImageResource(imageResources[currentImageIndex]);
                imageSwitcherHandler.postDelayed(this, 4000); // Change image every 4 seconds
            }
        }, 4000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Stop the handler when the activity is destroyed
        imageSwitcherHandler.removeCallbacksAndMessages(null);
    }
}
