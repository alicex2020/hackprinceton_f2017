package com.example.quickstart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
//import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Match2 extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    String noYash = "ygovil@princeton.edu", noKhyati = "khyatia@princeton.edu", message, email;
    EditText text;
    Button sendY, sendK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match2);
        sendK = (Button) findViewById(R.id.Match2);
        sendY = (Button) findViewById(R.id.Match1);
        text = (EditText) findViewById(R.id.Message);


        sendK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                email = noKhyati;
                sendEmail();
            }
        });
        sendY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                email = noYash;
                sendEmail();
            }
        });

    }

    protected void sendEmail() {
        message = text.getText().toString();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{email});
        i.putExtra(Intent.EXTRA_SUBJECT, "Your Gymder match!");
        i.putExtra(Intent.EXTRA_TEXT   , message);
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Match2.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }
}