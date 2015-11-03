package org.gdgxiamen.codelab.firebase_gate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextNumber;
    Button mButtonIn;
    Button mButtonOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextNumber = (TextView) findViewById(R.id.textNumber);
        mButtonIn = (Button) findViewById(R.id.buttonIn);
        mButtonOut = (Button) findViewById(R.id.buttonOut);
    }
}
