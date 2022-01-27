package org.techtown.doitandroid_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mission03Activity extends AppCompatActivity
{
    ImageView imageViewUp;
    ImageView imageViewDown;

    int imageIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission03);

        imageViewUp = findViewById(R.id.imageViewUp);
        imageViewDown = findViewById(R.id.imageViewDown);

        Button buttonUp = findViewById(R.id.buttonUp);
        buttonUp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                moveImageUp();
            }
        });

        Button buttonDown = findViewById(R.id.buttonDown);
        buttonDown.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                moveImageDown();
            }
        });
    }

    private void moveImageUp()
    {
        imageViewUp.setImageResource(R.drawable.foto02);
        imageViewDown.setImageResource(0);

        imageViewUp.invalidate();
        imageViewDown.invalidate();
    }

    private void moveImageDown()
    {
        imageViewUp.setImageResource(0);
        imageViewDown.setImageResource(R.drawable.foto02);

        imageViewUp.invalidate();
        imageViewDown.invalidate();
    }
}