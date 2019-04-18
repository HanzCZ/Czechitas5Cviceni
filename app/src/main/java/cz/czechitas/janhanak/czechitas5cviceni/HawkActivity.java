package cz.czechitas.janhanak.czechitas5cviceni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.orhanobut.hawk.Hawk;

public class HawkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawk);
        Hawk.init(this).build();


        final EditText input = findViewById(R.id.input);
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ukladamHodnotu =input.getText().toString();
                Hawk.put("input", ukladamHodnotu);
            }
        });
        String ulozenaHodnota = Hawk.get("input");
        input.setText(ulozenaHodnota);
    }
}
