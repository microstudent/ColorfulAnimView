package com.microstudent.app.colorfulanimview;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by 45517 on 2016/1/11.
 */
public class RoundBean {
    private int color;
    private Paint paint;
    private int x;
    private int y;
    private float alpha;
    private float scaleFactor;//0f~1f
    private int size;

    private Refresher refresher;

    public interface Refresher{
        void invalidate();
    }

    public RoundBean(int color,Refresher refresher) {
        paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.refresher = refresher;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        refresher.invalidate();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        refresher.invalidate();
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        if (paint != null) {
            paint.setAlpha((int) (alpha * 255));
        }
        refresher.invalidate();
    }

    public float getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
        refresher.invalidate();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        if (paint == null) {
            paint = new Paint();
        }
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        refresher.invalidate();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        refresher.invalidate();
    }

    public void setAttrs(int color, int x, int y, int size, float alpha, float scaleFactor) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.alpha = alpha;
        this.scaleFactor = scaleFactor;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
        }
        paint.setAlpha((int) (255 * alpha));
    }

    public void draw(Canvas canvas){
        canvas.drawCircle(getX(), getY(), getSize() / 2, getPaint());
    }
}
