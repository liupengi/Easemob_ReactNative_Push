package com.awesomeproject;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PushActivity extends AppCompatActivity implements OnClickListener{
    private TextView tvTakePhoto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_select);
        tvTakePhoto = (TextView) findViewById(R.id.tv_take_photo);

        tvTakePhoto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_take_photo:



            break;

        }
    }


}