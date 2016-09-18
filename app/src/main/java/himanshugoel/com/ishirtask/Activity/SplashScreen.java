package himanshugoel.com.ishirtask.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;

import himanshugoel.com.ishirtask.Facebook.FacebookLogin;
import himanshugoel.com.ishirtask.Facebook.LoginCallBack;
import himanshugoel.com.ishirtask.R;
import himanshugoel.com.ishirtask.Utils.Intents;
import himanshugoel.com.ishirtask.Utils.IshirUtils;

public class SplashScreen extends BaseActivity implements View.OnClickListener, LoginCallBack {
    CallbackManager callbackManager;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFacebookSdk();
        setContentView(R.layout.activity_facebook);
        initViews();
        initClickListners();
        IshirUtils.getHashKeys(SplashScreen.this);
    }

    public void initViews() {
        btnLogin = (Button) findViewById(R.id.connectWithFbButton);
    }

    @Override
    public void initClickListners() {
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.connectWithFbButton) {
            callbackManager = FacebookLogin.fbLogin(SplashScreen.this);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }


    @Override
    public void onLogin() {
        Intents.callProfilePage(SplashScreen.this);
    }
}
