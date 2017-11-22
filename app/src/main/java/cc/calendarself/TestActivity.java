package cc.calendarself;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by lichengcai on 2017/11/20.
 */

public class TestActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.AlertDialog);
        View dialogContent = View.inflate(this, R.layout.dialog_splite_screen, null);
        builder.setView(dialogContent);
        builder.setCancelable(true);
        final AlertDialog dialog = builder.create();
        dialog.show();

        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay();  //为获取屏幕宽、高
        android.view.WindowManager.LayoutParams p = dialog.getWindow().getAttributes();  //获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.3);   //高度设置为屏幕的0.3
        p.width = (int) (d.getWidth() * 0.7);    //宽度设置为屏幕的0.5
        dialog.getWindow().setAttributes(p);     //设置生效
    }
}
