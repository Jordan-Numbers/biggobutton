package edu.washington.j75smith.biggobutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button bigButton;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bigButton = (Button) this.findViewById(R.id.button);
        bigButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                String message = "You have pushed me " + count + " times!";
                bigButton.setText(message);
            }
        });
    }

}
