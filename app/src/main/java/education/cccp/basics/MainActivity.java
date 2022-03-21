package education.cccp.basics;


import static education.cccp.basics.R.layout.second_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(education.cccp.basics.R.layout.activity_main);
        setContentView(second_activity);
    }

    public void editTextDateOnClickEventListener(View view) {
    }
}