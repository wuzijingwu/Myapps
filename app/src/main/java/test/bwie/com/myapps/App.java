package test.bwie.com.myapps;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by dell on 2017/10/30.
 */

public class App extends Application {
    @Override

    public void onCreate() {
        super.onCreate();
        /**
         * 初始化融云
         */
        RongIM.init(this);
    }
}
