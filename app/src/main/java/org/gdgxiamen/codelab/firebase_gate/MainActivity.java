package org.gdgxiamen.codelab.firebase_gate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView mTextNumber;
    Button mButtonIn;
    Button mButtonOut;

    Firebase mFirebaseRef;

    Long peopleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);

        mTextNumber = (TextView) findViewById(R.id.textNumber);
        mButtonIn = (Button) findViewById(R.id.buttonIn);
        mButtonOut = (Button) findViewById(R.id.buttonOut);

        mFirebaseRef = new Firebase("https://codelab-gate.firebaseio.com/people-number");

        mFirebaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                peopleNumber = (Long) dataSnapshot.getValue();
                mTextNumber.setText(peopleNumber.toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
