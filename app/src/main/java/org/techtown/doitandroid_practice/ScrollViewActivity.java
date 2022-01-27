package org.techtown.doitandroid_practice;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollViewActivity extends AppCompatActivity
{
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        scrollView = findViewById(R.id.scrollView1);
        imageView = findViewById(R.id.imageView3);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.foto01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    public void onButton34Clicked(View view)
    {
        changeImage();
    }

    private void changeImage()
    {
        Resources res = getResources();
        if (imageIndex==0)
        {
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.foto02);
            imageIndex = 1;
        }
        else if(imageIndex==1)
        {
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.foto01);
            imageIndex = 0;
        }
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

}