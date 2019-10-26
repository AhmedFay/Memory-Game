package com.jezar.memorygame;

import android.app.Application;

import com.jezar.memorygame.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
