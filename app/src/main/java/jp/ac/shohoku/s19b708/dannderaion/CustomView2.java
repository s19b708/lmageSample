package jp.ac.shohoku.s19b708.dannderaion;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class CustomView2 extends View {
    private  Context context;

    /**
     * コンストラクタ
     * @param context
     * @param attrs
     */
    public CustomView2(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    /**
     * 描画するメソッド
     */
    @Override
    protected void onDraw(Canvas canvas){
        super. onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        int w = this.getWidth();
        int h = this.getHeight();
        Paint p = new Paint();
        p.setStyle(Style.STROKE);
        p.setColor(Color.DKGRAY);
        canvas.drawRect(new Rect(5,5,w-10,h-10),p);
        Resources rs = this.getContext().getResources();
        Bitmap bmp = BitmapFactory.decodeResource(rs, R.drawable.hiyori_eva);
        canvas.drawBitmap(bmp, 0, 0, p);
    }
}
