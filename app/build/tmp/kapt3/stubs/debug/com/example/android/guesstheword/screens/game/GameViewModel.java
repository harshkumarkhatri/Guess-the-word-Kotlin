package com.example.android.guesstheword.screens.game;

import java.lang.System;

/**
 * * ViewModel containing all the logic needed to run the game
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "score", "", "getScore", "()I", "setScore", "(I)V", "word", "", "getWord", "()Ljava/lang/String;", "setWord", "(Ljava/lang/String;)V", "wordList", "", "nextWord", "", "onCleared", "onCorrect", "onSkip", "resetList", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String word;
    private int score;
    private java.util.List<java.lang.String> wordList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWord() {
        return null;
    }
    
    public final void setWord(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getScore() {
        return 0;
    }
    
    public final void setScore(int p0) {
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
     * * Moves to the next word in the list.
     */
    private final void nextWord() {
    }
    
    public GameViewModel() {
        super();
    }
}