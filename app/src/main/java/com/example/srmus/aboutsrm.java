package com.example.srmus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class aboutsrm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutsrm); // Set the layout file

        // Initialize buttons
        ImageButton abtSrm = findViewById(R.id.abt_srm);
        ImageButton abtVnm = findViewById(R.id.abt_vnm);
        ImageButton abtHistory = findViewById(R.id.abt_history);
        ImageButton abtAwards = findViewById(R.id.abt_awards);
        ImageButton abtAct = findViewById(R.id.abt_act);
        ImageButton abtStatutes = findViewById(R.id.abt_statutes);

        // Set click listeners for each button with respective URLs
        abtSrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/welcome-to-srm");
            }
        });

        abtVnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/vision-mission");
            }
        });

        abtHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/srm-history");
            }
        });

        abtAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/awards");
            }
        });

        abtAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/view/about/srm-sikkim-university-act.pdf");
            }
        });

        abtStatutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/assets/documents/About/SRMUS%20Statute.pdf");
            }
        });
    }

    // Helper method to open a URL
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent); // Launch the browser or PDF viewer
    }
}
