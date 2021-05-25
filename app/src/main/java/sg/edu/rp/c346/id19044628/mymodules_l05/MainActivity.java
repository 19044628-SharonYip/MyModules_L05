package sg.edu.rp.c346.id19044628.mymodules_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvData;
    TextView tvMob;
    TextView tvServ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData=findViewById(R.id.tvData);
        tvMob=findViewById(R.id.tvMob);
        tvServ=findViewById(R.id.tvServ);

        tvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","Module Code: C322");
                intent.putExtra("name","Module Name: Data Centre and Cloud Management");
                intent.putExtra("year", "Academic Year: 2021");
                intent.putExtra("sem", "Semester: 1");
                intent.putExtra("credit", "Module Credit: 4");
                intent.putExtra("venue", "Venue: E61G");
                startActivity(intent);
            }
        });

        tvMob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","Module Code: C346");
                intent.putExtra("name","Module Name: Android Programming");
                intent.putExtra("year", "Academic Year: 2021");
                intent.putExtra("sem", "Semester: 1");
                intent.putExtra("credit", "Module Credit: 4");
                intent.putExtra("venue", "Venue: E62E");
                startActivity(intent);

            }
        });

        tvServ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","Module Code: C382");
                intent.putExtra("name","Module Name: IT Service Delivery");
                intent.putExtra("year", "Academic Year: 2021");
                intent.putExtra("sem", "Semester: 1");
                intent.putExtra("credit", "Module Credit: 4");
                intent.putExtra("venue", "Venue: E62G");
                startActivity(intent);
            }
        });

    }
}