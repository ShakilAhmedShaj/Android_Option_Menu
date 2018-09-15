package com.t3ch.shaj.android_option_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.settings_id) {
            Toast.makeText(MainActivity.this, "Settings Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.share_id) {
            Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.feedback_id) {
            Toast.makeText(MainActivity.this, "FeedBack Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.about_id) {
            Toast.makeText(MainActivity.this, "About Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
