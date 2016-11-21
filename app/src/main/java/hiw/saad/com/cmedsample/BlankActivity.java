package hiw.saad.com.cmedsample;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by saad on 11/21/16.
 */


public class BlankActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_blank);



    }
}

