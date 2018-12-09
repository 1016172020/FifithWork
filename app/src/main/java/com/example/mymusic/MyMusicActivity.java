package com.example.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyMusicActivity extends AppCompatActivity {
    Button ic_log;
    Button ic_reg;
    Button ic_wx;
    Button ic_qq;
    Intent kb,map,qq,wx;


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

    }

    private class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ic_log:
                    kb = new Intent(MyMusicActivity.this, KbActivity.class);
                    startActivity(kb);
                    break;
                case R.id.ic_reg:
                    map = new Intent(MyMusicActivity.this, MapActivity.class);
                    startActivity(map);
                    break;
                case R.id.ic_wx:
                    wx = new Intent(MyMusicActivity.this, LoginActivity.class);
                    startActivity(wx);
                case R.id.ic_qq:
                    qq = new Intent(MyMusicActivity.this, LoginActivity.class);
                    startActivity(qq);
                    break;
                    default:
            }
        }
    }
}
