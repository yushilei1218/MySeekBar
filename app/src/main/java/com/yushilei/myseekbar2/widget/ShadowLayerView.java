package com.yushilei.myseekbar2.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author by  yushilei.
 * @time 2016/9/12 -15:40.
 * @Desc
 */
public class ShadowLayerView extends View {
    public ShadowLayerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        Paint paint3 = new Paint();
        paint3.setColor(Color.RED);
        paint3.setAntiAlias(true);
        paint3.setShadowLayer(40, 5, 2, Color.GREEN);
        canvas.drawCircle(x, y, 30, paint3);
    }
}
