package androidlab.drawobjects;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent it = getIntent();
        String shapeColor = it.getStringExtra("hexColor");
        String shape = it.getStringExtra("shape");
        Drawable dr = new Drawable(this, shapeColor, shape);
        dr.setBackgroundColor(Color.WHITE);
        setContentView(dr);
    }

    public class Drawable extends View {

        String color;
        String shape;
        Paint line;
        Paint circle;
        Paint rect;
        public Drawable(Context context, String color, String shape) {
            super(context);
            this.color = color;
            this.shape = shape;
            line = new Paint();
            line.setColor(Color.parseColor(color));
            line.setStyle(Paint.Style.STROKE);
            line.setStrokeWidth(25);
            circle = new Paint();
            circle.setStyle(Paint.Style.FILL);
            circle.setColor(Color.parseColor(color));
            rect = new Paint();
            rect.setStyle(Paint.Style.FILL);
            rect.setColor(Color.parseColor(color));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if(shape.toLowerCase().equals("circle"))
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, 200, circle);
            else if(shape.toLowerCase().equals("rectangle"))
                canvas.drawRect(100, 500, 1000, 1000, rect);
            else
                canvas.drawLine(50, 100, 100 * 10, 100, line);
        }
    }
}
