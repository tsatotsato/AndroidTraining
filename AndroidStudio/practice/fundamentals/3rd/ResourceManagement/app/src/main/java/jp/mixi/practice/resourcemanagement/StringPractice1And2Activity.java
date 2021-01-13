package jp.mixi.practice.resourcemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StringPractice1And2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_practice1);

        String str = getString(R.string.toast_message, "君", 10000);
        TextView textview = (TextView) findViewById(R.id.textView6);
        textview.setText(str);

    }

}
