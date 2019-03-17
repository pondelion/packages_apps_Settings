package com.android.settings.logging;

import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.View;
import android.view.MenuInflater;

import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;

public class LoggingSettings extends SettingsPreferenceFragment {
    public static final String TAG = "LoggingSettings";

    @Override
    public int getMetricsCategory() {
        return 0;
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.logging_settings);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
}
