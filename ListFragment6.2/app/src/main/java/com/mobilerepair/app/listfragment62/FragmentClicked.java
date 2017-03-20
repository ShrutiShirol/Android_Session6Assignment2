package com.mobilerepair.app.listfragment62;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FragmentClicked extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_clicked);

        text=(TextView)findViewById(R.id.textView);
        String data = getIntent().getExtras().getString("DATAPASSED");

        text.setText(data);
    }
}
