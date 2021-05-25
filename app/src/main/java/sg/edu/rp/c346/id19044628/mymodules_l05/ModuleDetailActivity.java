package sg.edu.rp.c346.id19044628.mymodules_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode=findViewById(R.id.tvCode);
        tvName=findViewById(R.id.tvName);
        tvYear=findViewById(R.id.tvYear);
        tvSem=findViewById(R.id.tvSem);
        tvCredit=findViewById(R.id.tvCredit);
        tvVenue=findViewById(R.id.tvVenue);
        btnBack=findViewById(R.id.btnBack);

        Intent intentReceived= getIntent();
        String code= intentReceived.getStringExtra("code");
        String name=intentReceived.getStringExtra("name");
        String year=intentReceived.getStringExtra("year");
        String sem=intentReceived.getStringExtra("sem");
        String credit=intentReceived.getStringExtra("credit");
        String venue=intentReceived.getStringExtra("venue");


        tvCode.setText(code);
        tvName.setText(name);
        tvYear.setText(year);
        tvSem.setText(sem);
        tvCredit.setText(credit);
        tvVenue.setText(venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}