package utilities;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sergio on 23/02/2015.
 */
public class GetBorder extends TextView {

    public GetBorder(Context context){

        super(context);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        canvas.drawLine(0,0,this.getWidth()-1,0,paint);
        canvas.drawLine(0,0,0,this.getHeight()-1,paint);
        canvas.drawLine(this.getWidth()-1,0,this.getWidth()-1,this.getHeight()-1,paint);
        canvas.drawLine(0,this.getHeight()-1,this.getWidth()-1,this.getHeight()-1,paint);

    }
}
