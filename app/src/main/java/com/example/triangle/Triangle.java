package com.example.triangle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Triangle extends View {
    private Paint mPaint;

    public Triangle(Context context) {
        this(context, null);
    }
    public Triangle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public Triangle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Path path = new Path();
        path.moveTo(120,250);
        path.lineTo(240,480);
        path.lineTo(120,480);
        path.close();
        canvas.drawPath(path,mPaint);
    }
}
