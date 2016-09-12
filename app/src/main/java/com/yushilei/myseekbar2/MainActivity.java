package com.yushilei.myseekbar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yushilei.myseekbar2.widget.MySeekBar;

public class MainActivity extends AppCompatActivity implements MySeekBar.OnSeekFinishListener {

    private MySeekBar seekBar;
    private TextView maxTv;
    private TextView minTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (MySeekBar) findViewById(R.id.my_seek);
        maxTv = (TextView) findViewById(R.id.max);
        minTv = (TextView) findViewById(R.id.min);

        seekBar.setListener(this);
    }

    public void setPos(View view) {
        seekBar.setPos(2, 8);
    }

    @Override
    public void seekPos(MySeekBar.CircleIndicator left, MySeekBar.CircleIndicator right) {
        String leftStr = "¥" + left.getPoint().getMark();
        minTv.setText(leftStr);
        String rightStr = "¥" + right.getPoint().getMark();
        maxTv.setText(rightStr);
    }

    public void jump(View view) {
        startActivity(new Intent(this, ShadowLayerActivity.class));
    }
}
