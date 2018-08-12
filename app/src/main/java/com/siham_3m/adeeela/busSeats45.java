package com.siham_3m.adeeela;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class busSeats45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_seats45);
    }

    public void buProceed(View view) {
        Intent intent = new Intent(this, confirmation.class);
        startActivity(intent);

    }
}
