package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentImage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Next(View view)
    {
        try{
            String idX="pic"+currentImage;
            int x=this.getResources().getIdentifier(idX,"id",getPackageName());
            ImageView img=(ImageView)findViewById(x);
            img.setAlpha(0f);
            currentImage=(5+currentImage+1)%5;
            String idY="pic"+currentImage;
            int y=this.getResources().getIdentifier(idY,"id",getPackageName());
            img=(ImageView)findViewById(y);
            img.setAlpha(1f);
        }
        catch(Exception e)
        {
            TextView t=findViewById(R.id.textView);
            t.setText(e.toString());
        }
        }

    public void Previous(View view) {
        try {
            String idX="pic"+currentImage;
            int x=this.getResources().getIdentifier(idX,"id",getPackageName());
            ImageView img=(ImageView) findViewById(x);
            img.setAlpha(0f);
            currentImage=(5+currentImage-1)%5;
            String idY="pic"+currentImage;
            int y=this.getResources().getIdentifier(idY,"id",getPackageName());
            img=(ImageView)findViewById(y);
            img.setAlpha(1f);
        } catch (Exception e) {
            TextView textView=findViewById(R.id.textView);
            textView.setText(e.toString());
        }

    }

}

