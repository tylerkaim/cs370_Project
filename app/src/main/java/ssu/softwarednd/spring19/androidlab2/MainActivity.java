package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button twoImage;
    private Button oneImage;
    private Button saved_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoImage = findViewById(R.id.two_image);
        oneImage = findViewById(R.id.one_image);
        saved_activity = findViewById(R.id.saved_button);

        saved_activity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SavedActivity.class);
                startActivity(intent);
            }
        });

        twoImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TwoImage.class);
                startActivity(intent);
            }
        });

        oneImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, OneImage.class);
                startActivity(intent);
            }
        });


    }
}

