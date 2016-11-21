package hiw.saad.com.cmedsample;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by saad on 10/31/16.
 */


public class sampletransparentActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample);



            }
        }



