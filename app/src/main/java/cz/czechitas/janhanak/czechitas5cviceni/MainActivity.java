package cz.czechitas.janhanak.czechitas5cviceni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hawkButton = findViewById(R.id.hawkButton);
        Button sharedPrefButton = findViewById(R.id.sharedPrefButton);

        hawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HawkActivity.class);
                startActivity(intent);
            }
        });
        sharedPrefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SharedPrefActivity.class);
                startActivity(intent);
            }
        });
    }
}
