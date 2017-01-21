package helper;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.ayubbaba.passwordsaver.passwordsaver.R;

/**
 * Created by ayub on 19-Jan-17.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
//        init(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs){
        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.CustomTextView,0,0);

    }
}
