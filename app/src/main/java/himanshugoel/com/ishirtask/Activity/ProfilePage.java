package himanshugoel.com.ishirtask.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import himanshugoel.com.ishirtask.R;
import himanshugoel.com.ishirtask.Utils.Preferences;

public class ProfilePage extends BaseActivity {
    String dob;
    private ImageView imgPerson;
    private TextView txtEmail;
    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtTimeZone;
    private TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        Preferences.getUserData(getApplicationContext());
        initViews();
        initDataToViews();
    }

    private void initDataToViews() {
        Picasso.with(getApplicationContext()).load(Preferences.getImageUrl()).into(imgPerson);
        txtFirstName.setText(Preferences.getFirstName());
        txtLastName.setText(Preferences.getLastName());
        txtEmail.setText(Preferences.getEmail());
        txtAge.setText(Preferences.getDob());
        txtTimeZone.setText(Preferences.getTimeZone());

    }

    @Override
    public void initViews() {
        imgPerson = (ImageView) findViewById(R.id.imgPerson);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtFirstName = (TextView) findViewById(R.id.txtFirstName);
        txtLastName = (TextView) findViewById(R.id.txtLastName);
        txtTimeZone = (TextView) findViewById(R.id.txtTimeZone);
        txtAge = (TextView) findViewById(R.id.txtAge);

    }

    @Override
    public void initClickListners() {

    }
}
