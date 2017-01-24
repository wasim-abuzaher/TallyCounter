package com.wasimapps.tallycounter;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.BoxInsetLayout;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int tally;
    private TextView tallyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tally = 0;

            Button tallyButton = (Button) findViewById(R.id.button_click);
            tallyButton.setOnClickListener(onClickTallyButton);

            Button resetButton = (Button) findViewById(R.id.button_reset);
            resetButton.setOnClickListener(onClickResetButton);

            tallyText = (TextView) findViewById(R.id.textView_tally);
            tallyText.setText(String.valueOf(tally));
    }

    private View.OnClickListener onClickTallyButton = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            tally++;
            tallyText.setText(String.valueOf(tally));
        }
    };

    private View.OnClickListener onClickResetButton = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            tally = 0;
            tallyText.setText(String.valueOf(tally));
        }
    };
}
