package com.painless.clock.setting;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.painless.clock.Constants;
import com.painless.clock.R;

public class ClockSettings extends PreferenceActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		getPreferenceManager().setSharedPreferencesName(Constants.SHARED_PREFS_NAME);
		addPreferencesFromResource(R.xml.settings);
	}

	@Override
	protected void onResume() {
	  super.onResume();

	  findPreference(CityInfo.USER_LOCATION).setSummary(
	      getPreferenceManager().getSharedPreferences().getString(CityInfo.USER_LOCATION, CityInfo.LOCATION_DEFAULT));
	}
}
