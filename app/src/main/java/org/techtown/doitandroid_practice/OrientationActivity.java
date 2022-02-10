package org.techtown.doitandroid_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrientationActivity extends AppCompatActivity
{
    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        showToast("onString 호출됨.");

        editText=findViewById(R.id.editTextTextPersonName3);

        Button button = findViewById(R.id.button36);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                name = editText.getText().toString();
                showToast("입력된 값을 변수에 저장했습니다 : " + name);
            }
        });

        if(savedInstanceState !=null)
        {
            name = savedInstanceState.getString("name");
            showToast("값을 복원했습니다. : " + name);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);

        outState.putString("name",name);
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