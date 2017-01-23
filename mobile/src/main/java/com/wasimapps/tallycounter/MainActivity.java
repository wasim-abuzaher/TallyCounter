package com.wasimapps.tallycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tally;
    TextView tallyText = (TextView) findViewById(R.id.textView_tally);
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tally = 0;


        Button tallyButton = (Button) findViewById(R.id.button_click);
        tallyButton.setOnClickListener(onClickTallyButton);


        tallyText.setText(String.valueOf(tally));

    }

    private View.OnClickListener onClickTallyButton = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            tally++;
            tallyText.setText(String.valueOf(tally));
        }
    };


}


