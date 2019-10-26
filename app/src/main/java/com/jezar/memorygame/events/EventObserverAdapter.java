package com.jezar.memorygame.events;

import com.jezar.memorygame.events.engine.FlipDownCardsEvent;
import com.jezar.memorygame.events.engine.GameWonEvent;
import com.jezar.memorygame.events.engine.HidePairCardsEvent;
import com.jezar.memorygame.events.ui.BackGameEvent;
import com.jezar.memorygame.events.ui.FlipCardEvent;
import com.jezar.memorygame.events.ui.NextGameEvent;
import com.jezar.memorygame.events.ui.ResetBackgroundEvent;
import com.jezar.memorygame.events.ui.ThemeSelectedEvent;
import com.jezar.memorygame.events.ui.DifficultySelectedEvent;
import com.jezar.memorygame.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
