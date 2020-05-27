package com.example.android.guesstheword.screens.game;

import java.lang.System;

/**
 * * ViewModel containing all the logic needed to run the game
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_eventfinish", "Landroidx/lifecycle/MutableLiveData;", "", "_score", "", "_word", "", "eventfinish", "Landroidx/lifecycle/LiveData;", "getEventfinish", "()Landroidx/lifecycle/LiveData;", "score", "getScore", "word", "getWord", "wordList", "", "nextWord", "", "onCleared", "onCorrect", "onGameFinishComplete", "onSkip", "ongamefinish", "resetList", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _word = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    private java.util.List<java.lang.String> wordList;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventfinish = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventfinish() {
        return null;
    }
    
    /**
     * * Resets the list of words and randomizes the order
     */
    private final void resetList() {
    }
    
    /**
     * * Callback called when the ViewModel is destroyed
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * Methods for updating the UI 
     */
    public final void onSkip() {
    }
    
    public final void onCorrect() {
    }
    
    /**
     * game complete event method 
     */
    public final void ongamefinish() {
    }
    
    public final void onGameFinishComplete() {
    }
    
    /**
     * * Moves to the next word in the list.
     */
    private final void nextWord() {
    }
    
    public GameViewModel() {
        super();
    }
}