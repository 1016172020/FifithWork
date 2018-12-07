package com.example.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyMusicActivity extends AppCompatActivity  {
    Button ic_log;
    Button ic_reg;
    Button ic_wx;
    Button ic_qq;
    Button ic_wb;
    Button ic_wy;
    Intent a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_music);
        Button btn_log = (Button) findViewById(R.id.ic_log);
        btn_log.setOnClickListener(new ButtonListener());
        Button btn_reg = (Button) findViewById(R.id.ic_reg);
        btn_reg.setOnClickListener(new ButtonListener());
        Button btn_wx = (Button) findViewById(R.id.ic_wx);
        btn_wx.setOnClickListener(new ButtonListener());
        Button btn_qq = (Button) findViewById(R.id.ic_qq);
        btn_qq.setOnClickListener(new ButtonListener());
        Button btn_wb = (Button) findViewById(R.id.ic_wb);
        btn_wb.setOnClickListener(new ButtonListener());
        Button btn_wy = (Button) findViewById(R.id.ic_wy);
        btn_wy.setOnClickListener(new ButtonListener());
    }
    private class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ic_log:
                    a = new Intent(MyMusicActivity.this, LoginActivity.class);
                    startActivity(a);
                    break;
                case R.id.ic_reg:
                    Toast.makeText(MyMusicActivity.this,"暂未开启此功能喔",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ic_wx:
                    Toast.makeText(MyMusicActivity.this,"暂未开启此功能喔",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ic_qq:
                    Toast.makeText(MyMusicActivity.this,"暂未开启此功能喔",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ic_wb:
                    Toast.makeText(MyMusicActivity.this,"暂未开启此功能喔",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ic_wy:
                    Toast.makeText(MyMusicActivity.this,"暂未开启此功能喔",Toast.LENGTH_SHORT).show();
                    break;
                    default:
            }
        }
    }




}
