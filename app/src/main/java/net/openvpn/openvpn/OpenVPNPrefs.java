package net.openvpn.openvpn;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class OpenVPNPrefs extends PreferenceActivity {
    public void onCreate(Bundle savedInstanceState) {
        if (mt_mainbase.themeSet) {
            setTheme(mt_mainbase.themeResId);
        }
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
