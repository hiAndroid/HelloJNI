package taobao.com.hellojni.jni;

import android.util.Log;

/**
 * Created by wuzhong on 15/7/20.
 */
public class Hello {

    static {
        System.loadLibrary("hello");
    }

    public static native int add(int a, int b);

    public static native void testCallback();

    public static void onCallback(int a){
        Log.d("JNI>>>", "native static callback on result " + a );
    }


    public native void testCallback2();

    public void onCallback2(int a){
        Log.d("JNI>>>", "native  callback on result " + a );
    }

}
