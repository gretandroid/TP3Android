package education.cccp.basics;


import static education.cccp.basics.R.layout.activity_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_constraint_layout);
    }

    public void editTextDateOnClickEventListener(View view) {
    }
}