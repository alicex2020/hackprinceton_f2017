package com.example.gymder;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddFriendsPage extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friends_page);
        //sharedPref = getActivity().getPreferences("test",0);
        //editor = sharedPref.edit();

    }

    public void Submit(View view) {
        EditText input = (EditText) findViewById(R.id.inputEmail);
        String string = input.getText().toString();
/*
        Calendar service = new Calendar.Builder(httpTransport, jsonFactory, credentials)
                .setApplicationName("applicationName").build();


        // Retrieve the friend's events
        DateTime now = new DateTime(System.currentTimeMillis());
        DateTime max = new DateTime("2017-11-12T23:59:00-05:00");
        List<String> eventStrings = new ArrayList<String>();
        Events events = service.events().list("string")
                .setMaxResults(10)
                .setTimeMin(now)
                .setTimeMax(max)
                .setOrderBy("startTime")
                .setSingleEvents(true)
                .execute();
        List<Event> items = events.getItems();

        for (Event event : items) {
            DateTime start = event.getStart().getDateTime();
            if (start == null) {
                // All-day events don't have start times, so just use
                // the start date.
                start = event.getStart().getDate();
            }
            eventStrings.add(
                    String.format("%s (%s)", event.getSummary(), start));
        }
        editor.putStringSet(string, eventStrings);
        editor.commit();
        */
    }
}




