package me.ztiany.socialization.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.sdk.social.wechat.WeChatManager;

public class MainActivity extends AppCompatActivity {

    static {
        WeChatManager.initWeChatSDK(AppContext.getAppContext(), "wxd36d9f6dee53dd91", "75d46c5c0c9c6302d4f707c634ea631f");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
        Toast.makeText(this, "WeChat Installed = " + WeChatManager.getInstance().isInstalledWeChat(), Toast.LENGTH_SHORT).show();
    }

}