package com.example.user.tictactoe;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.os.Bundle;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    int status, boardStatus;
    CheckBox three, five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CheckBox three = (CheckBox) findViewById(R.id.threebythree);
        CheckBox five = (CheckBox) findViewById(R.id.fivebyfive);

        three.isChecked();
    }


    public void gameType(View view) {
        // Checking the game type selected
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.human:
                if (checked)
                    status = 1;
                break;
            case R.id.humanc:
                if (checked)
                    status = 2;
                Toast.makeText(this, "This option is not available yet", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //Checking to see which board type is selected
    public void boardType(View view) {
        CheckBox three = (CheckBox) findViewById(R.id.threebythree);
        CheckBox five = (CheckBox) findViewById(R.id.fivebyfive);
        if (five.isChecked()) {
            boardStatus = 2;
            return;
        }

        if (five.isChecked() && three.isChecked()) {
            Toast.makeText(this, "You will be taken to the last board you checked", Toast.LENGTH_SHORT).show();
        } else {
            boardStatus = 1;
            return;
        }

    }

    public void starter(View view) {
        if (boardStatus == 1 && status == 1) {
            Intent moveTo = new Intent(HomeActivity.this, Three_grids.class);
            startActivity(moveTo);
        }
        if (boardStatus == 2 && status == 1) {
            Intent moveTo2 = new Intent(HomeActivity.this, Home.class);
            startActivity(moveTo2);

        }
        if (status == 2) {
            Toast.makeText(this, "Playing against Computer not available", Toast.LENGTH_SHORT).show();
        }

    }
}