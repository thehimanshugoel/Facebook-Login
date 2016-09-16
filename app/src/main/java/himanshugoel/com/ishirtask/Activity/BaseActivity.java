package himanshugoel.com.ishirtask.Activity;

import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;

import himanshugoel.com.ishirtask.R;

/**
 * Created by Himanshu on 16-09-2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public void initFacebookSdk() {
        FacebookSdk.sdkInitialize(BaseActivity.this);
    }

   public abstract void initViews();
    public abstract void initClickListners();


}
