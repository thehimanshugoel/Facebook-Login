package himanshugoel.com.ishirtask.Utils;

import android.app.Activity;
import android.content.Intent;

import himanshugoel.com.ishirtask.Activity.ProfilePage;

/**
 * Created by Himanshu on 16-09-2016.
 */
public class Intents {

    public static void callProfilePage(Activity activity) {
        Intent intent = new Intent(activity, ProfilePage.class);
        activity.startActivity(intent);
    }
}
