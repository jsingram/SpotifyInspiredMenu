package net.ingramintegrations.spotifyinspiredmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup our custom toolbar.
        setupToolBar();

    }

    public void setupToolBar() {
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Setup Our Icons
        ImageView menuHome = (ImageView) findViewById(R.id.menu_home);
        ImageView menuSearch = (ImageView) findViewById(R.id.menu_search);

        // Setting OnClickListener for menuHome
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message
                Toast.makeText(getApplicationContext(), "You just clicked on the home button.", Toast.LENGTH_LONG).show();
            }
        });

        // Setting OnClickListener for menuSearch
        menuSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigating to our Search Activity
                startActivity(new Intent(getApplicationContext(), SearchActivity.class));
            }
        });
    }

}
