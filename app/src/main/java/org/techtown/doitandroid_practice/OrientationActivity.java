package org.techtown.doitandroid_practice;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrientationActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        showToast("onString 호출됨.");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        showToast("onStop 호출됨.");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        showToast("onDestroy 호출됨.");
    }

    private void showToast(String s)
    {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

}