package ravi.com.myapplication81;

import android.preference.PreferenceActivity;
import android.os.Bundle;


public class Settings extends PreferenceActivity {
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.user_settings);
    }

}
