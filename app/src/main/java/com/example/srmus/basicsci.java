package com.example.srmus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class basicsci extends AppCompatActivity {

    // Declare your ImageButton and Button
    private ImageButton imageButton1, imageButton2, imageButton3, imageButton4;
    private Button buttonSyllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicsci);  // Replace with your XML layout file name

        // Initialize the views by finding them by ID
        buttonSyllabus = findViewById(R.id.button5);
        imageButton1 = findViewById(R.id.imageButton1); // Chemistry
        imageButton2 = findViewById(R.id.imageButton2); // Physics
        imageButton3 = findViewById(R.id.imageButton3); // Botany
        imageButton4 = findViewById(R.id.imageButton4); // Zoology

        // Set OnClickListener for the "SYLLABUS" button if needed
        buttonSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle syllabus button click (e.g., navigate to a syllabus page or activity)
                // For now, you could open a generic link or do nothing.
                openLink("https://srmus.ac.in/department-of-science"); // Example URL
            }
        });

        // Set OnClickListener for each ImageButton to open respective URLs
        imageButton1.setOnClickListener(new View.OnClickListener() {  // Chemistry
            @Override
            public void onClick(View v) {
                openLink("https://srmus.ac.in/department-of-chemistry");
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {  // Physics
            @Override
            public void onClick(View v) {
                openLink("https://srmus.ac.in/department-of-physics");
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {  // Botany
            @Override
            public void onClick(View v) {
                openLink("https://srmus.ac.in/department-of-botany");
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {  // Zoology
            @Override
            public void onClick(View v) {
                openLink("https://srmus.ac.in/department-of-zoology");
            }
        });
    }

    // Helper method to open a URL
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent); // This will open the URL in the default browser
    }
}
