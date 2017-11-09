package com.example.gsa.techmates;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the userone
        TextView userone = (TextView) findViewById(R.id.userone);

        // Set a click listener on that View
        userone.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the userone is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link userone}
                Intent useroneIntent = new Intent(MainActivity.this, userone.class);

                // Start the new activity
                startActivity(useroneIntent);
            }
        });

        // Find the View that shows the usertwo
        TextView usertwo = (TextView) findViewById(R.id.usertwo);

        // Set a click listener on that View
        usertwo.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the usertwo is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link usertwo}
                Intent usertwoIntent = new Intent(MainActivity.this, usertwo.class);

                // Start the new activity
                startActivity(usertwoIntent);
            }
        });


        // Find the View that shows the usertwo
        TextView userthree = (TextView) findViewById(R.id.userthree);

        // Set a click listener on that View
        userthree.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the userthree is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link userthree}
                Intent userthreeIntent = new Intent(MainActivity.this, userthree.class);

                // Start the new activity
                startActivity(userthreeIntent);
            }
        });






    }

}

