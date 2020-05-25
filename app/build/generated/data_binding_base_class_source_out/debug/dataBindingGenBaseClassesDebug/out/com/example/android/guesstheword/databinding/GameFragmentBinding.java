package com.example.android.guesstheword.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class GameFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button correctButton;

  @NonNull
  public final Button endGameButton;

  @NonNull
  public final ConstraintLayout gameLayout;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final TextView scoreText;

  @NonNull
  public final Button skipButton;

  @NonNull
  public final TextView timerText;

  @NonNull
  public final TextView wordIsText;

  @NonNull
  public final TextView wordText;

  protected GameFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button correctButton, Button endGameButton, ConstraintLayout gameLayout, Guideline guideline,
      TextView scoreText, Button skipButton, TextView timerText, TextView wordIsText,
      TextView wordText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.correctButton = correctButton;
    this.endGameButton = endGameButton;
    this.gameLayout = gameLayout;
    this.guideline = guideline;
    this.scoreText = scoreText;
    this.skipButton = skipButton;
    this.timerText = timerText;
    this.wordIsText = wordIsText;
    this.wordText = wordText;
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.game_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GameFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.game_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.game_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GameFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.game_fragment, null, false, component);
  }

  public static GameFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static GameFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (GameFragmentBinding)bind(component, view, com.example.android.guesstheword.R.layout.game_fragment);
  }
}
