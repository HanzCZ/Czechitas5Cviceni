package cz.czechitas.janhanak.czechitas5cviceni;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPrefActivity extends AppCompatActivity {

    static String folder = "czechitas5cviceni";
    static String login = "login1";

    private SharedPreferences prefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        prefs = this.getSharedPreferences(folder, Context.MODE_PRIVATE);
        final EditText input = findViewById(R.id.input);
        Button saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = input.getText().toString();
                prefs.edit().putString(login, text).apply();
            }
        });

        input.setText(prefs.getString(login, ""));
    }
}
