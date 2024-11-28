package com.example.srmus;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class informationtech extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationtech);

        Button buttonBCA2017 = findViewById(R.id.button);
        buttonBCA2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/view/syllabus/2023-24/BCA%20CBCS%20%20Syllabus.pdf");
            }
        });

        Button buttonBCA2023 = findViewById(R.id.button2);
        buttonBCA2023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/view/syllabus/2023-24/BCA%20R-2023.pdf");
            }
        });

        Button buttonMCA = findViewById(R.id.button3);
        buttonMCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://srmus.ac.in/view/syllabus/2023-24/MCA%20CBCS%20Syllabus.pdf");
            }
        });
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}