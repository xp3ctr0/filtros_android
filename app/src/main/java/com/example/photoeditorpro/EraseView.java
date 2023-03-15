package com.example.photoeditorpro;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class EraseView extends View {
    Boolean allClear = false;
    private Bitmap bitmap;
    private float brushSize;
    private float lastBrushSize;
    private Canvas mCanvas;
    Boolean newAdded = false;
    private Paint paint;
    private Path path;
    private ArrayList<Bitmap> redobitmap = new ArrayList<>();
    private ArrayList<Bitmap> undobitmap = new ArrayList<>();

    public EraseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void onDraw(Canvas canvas) {
        if (this.mCanvas == null) {
            EraseBitmp();
        }
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
        this.mCanvas.drawPath(this.path, this.paint);
        super.onDraw(canvas);
    }

    public void EraseBitmp() {
        this.bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.brushSize = 5.0f;
        this.lastBrushSize = this.brushSize;
        this.paint = new Paint(4);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setPathEffect(new CornerPathEffect(1600.0f));
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(this.brushSize);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.SOLID));
        this.path = new Path();
        this.mCanvas = new Canvas(this.bitmap);
        this.mCanvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
    }

    public void Undo() {
        if (this.newAdded.booleanValue()) {
            this.redobitmap.add(this.bitmap.copy(this.bitmap.getConfig(), this.bitmap.isMutable()));
            this.newAdded = false;
        }
        if (this.redobitmap.size() > 1) {
            this.undobitmap.add(this.redobitmap.remove(this.redobitmap.size() - 1));
            this.bitmap = this.redobitmap.get(this.redobitmap.size() - 1).copy(this.bitmap.getConfig(), this.bitmap.isMutable());
            this.mCanvas = new Canvas(this.bitmap);
            invalidate();
            if (this.redobitmap.size() == 1) {
                this.allClear = true;
            }
        }
    }

    public void Redo() {
        if (this.undobitmap.size() > 0) {
            this.redobitmap.add(this.undobitmap.remove(this.undobitmap.size() - 1));
            this.bitmap = this.redobitmap.get(this.redobitmap.size() - 1).copy(this.bitmap.getConfig(), this.bitmap.isMutable());
            this.mCanvas = new Canvas(this.bitmap);
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        float ax = event.getX();
        float ay = event.getY();
        switch (event.getAction()) {
            case 0:
                this.newAdded = true;
                if (!this.allClear.booleanValue()) {
                    this.redobitmap.add(this.bitmap.copy(this.bitmap.getConfig(), this.bitmap.isMutable()));
                } else {
                    this.allClear = false;
                }
                this.path.moveTo(ax, ay);
                break;
            case 1:
                this.path.lineTo(ax, ay);
                this.path.reset();
                break;
            case 2:
                this.path.lineTo(ax, ay);
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }

    public void setBrushSize(float newSize) {
        this.brushSize = TypedValue.applyDimension(1, newSize, getResources().getDisplayMetrics());
        this.paint.setStrokeWidth(this.brushSize);
        this.paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.SOLID));
    }

    public void setLastBrushSize(float lastSize) {
        this.lastBrushSize = lastSize;
    }

    public float getLastBrushSize() {
        return this.lastBrushSize;
    }

    public void setImageBitmap(Bitmap frontBitmap) {
        this.bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.mCanvas = new Canvas(this.bitmap);
        this.mCanvas.drawBitmap(frontBitmap, 0.0f, 0.0f, (Paint) null);
        this.path.reset();
        invalidate();
    }
}
