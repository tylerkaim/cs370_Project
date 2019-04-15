package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button twoImageTopTextButton;
    private Button twoImageBottomTextButton;
    private Button twoImageBothTextButton;
    private Button oneImageTopTextButton;
    private Button oneImageBottomTextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoImageTopTextButton = findViewById(R.id.two_image_top_text_button);
        twoImageBottomTextButton = findViewById(R.id.two_image_bottom_text_button);
        twoImageBothTextButton = findViewById(R.id.two_image_two_text_button);
        oneImageTopTextButton = findViewById(R.id.one_image_top_text_button);
        oneImageBottomTextButton = findViewById(R.id.one_image_bottom_text_button);

        twoImageTopTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TwoImageTop.class);
                startActivity(intent);
            }
        });

        twoImageBottomTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TwoImageBottom.class);
                startActivity(intent);
            }
        });

        twoImageBothTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TwoImageTwo.class);
                startActivity(intent);
            }
        });

        oneImageTopTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, OneImageTop.class);
                startActivity(intent);
            }
        });

        oneImageBottomTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, OneImageBottom.class);
                startActivity(intent);
            }
        });

    }
}
