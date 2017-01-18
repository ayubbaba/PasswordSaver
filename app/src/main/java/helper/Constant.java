package helper;

import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;

/**
 * Created by ayub on 18-Jan-17.
 */

public class Constant {
    public static void t(View view,String msg) {
        Snackbar.make(view,msg,Snackbar.LENGTH_LONG).show();
    }
    public static void l(String log){
        Log.d("Password",log);
    }

}
