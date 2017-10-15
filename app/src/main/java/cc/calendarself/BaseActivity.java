package cc.calendarself;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import cc.calendarself.utils.StatusBarUtil;

/**
 * Created by lichengcai on 2017/10/15.
 */

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setStatusBar(this);
    }
}
