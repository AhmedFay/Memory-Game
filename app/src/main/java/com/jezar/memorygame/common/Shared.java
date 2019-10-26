package com.jezar.memorygame.common;

import android.content.Context;

import com.jezar.memorygame.MainActivity;
import com.jezar.memorygame.engine.Engine;
import com.jezar.memorygame.events.EventBus;

public class Shared {

	public static Context context;
	public static MainActivity activity; // it's fine for this app, but better move to weak reference
	public static Engine engine;
	public static EventBus eventBus;

}
