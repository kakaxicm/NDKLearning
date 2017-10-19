package com.qicode.ndklearning;

/**
 * Created by chenming on 2017/10/19
 */

public class JniHelloWord {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("helloword-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI();
}
