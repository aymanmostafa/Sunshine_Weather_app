package com.example.ayman.sunshine3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private final String FORECASTFRAGMENT_TAG = "FFTAG";
    private String mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoadd = new Intent(MainActivity.this, Custom_adapter.class);
                startActivity(gotoadd);
            }
        });
        mLocation = Utility.getPreferredLocation(this);
       /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                                       .add(R.id.fragment, new MainActivityFragment())
                                        .add(R.id.fragment, new MainActivityFragment(), FORECASTFRAGMENT_TAG)
                    .commit();
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String location = Utility.getPreferredLocation(this);
        // update the location in our second pane using the fragment manager
        if (location != null && !location.equals(mLocation)) {
            MainActivityFragment ff = (MainActivityFragment) getSupportFragmentManager().findFragmentByTag(FORECASTFRAGMENT_TAG);
            if (null != ff) {
                ff.onLocationChanged();
            }
            mLocation = location;
        }
    }
}
