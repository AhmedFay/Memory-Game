package com.jezar.memorygame.events;

import com.jezar.memorygame.events.engine.FlipDownCardsEvent;
import com.jezar.memorygame.events.engine.GameWonEvent;
import com.jezar.memorygame.events.engine.HidePairCardsEvent;
import com.jezar.memorygame.events.ui.BackGameEvent;
import com.jezar.memorygame.events.ui.DifficultySelectedEvent;
import com.jezar.memorygame.events.ui.FlipCardEvent;
import com.jezar.memorygame.events.ui.NextGameEvent;
import com.jezar.memorygame.events.ui.ResetBackgroundEvent;
import com.jezar.memorygame.events.ui.StartEvent;
import com.jezar.memorygame.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
