package com.yao.yoworld.Activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by yoyo on 2015/4/30.
 */
public  abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViews();
        init();
        setListeners();
    }

    protected abstract void findViews();

    protected abstract void init();

    protected abstract void setListeners();
}
