package mypet.fabiolindemberg.com.br.mypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    Button btnAdopt;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnAdopt = (Button) findViewById(R.id.btn_adopt);
        btnCancel = (Button) findViewById(R.id.btn_cancel);

        btnAdopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Parabéns, esse é seu Pet!", Toast.LENGTH_LONG).show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
