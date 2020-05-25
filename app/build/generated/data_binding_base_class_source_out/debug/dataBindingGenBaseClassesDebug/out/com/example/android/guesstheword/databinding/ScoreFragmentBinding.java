package com.example.android.guesstheword.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ScoreFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button playAgainButton;

  @NonNull
  public final ConstraintLayout scoreLayout;

  @NonNull
  public final TextView scoreText;

  @NonNull
  public final TextView youScoredText;

  protected ScoreFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button playAgainButton, ConstraintLayout scoreLayout, TextView scoreText,
      TextView youScoredText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.playAgainButton = playAgainButton;
    this.scoreLayout = scoreLayout;
    this.scoreText = scoreText;
    this.youScoredText = youScoredText;
  }

  @NonNull
  public static ScoreFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.score_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ScoreFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ScoreFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.score_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ScoreFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.score_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ScoreFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ScoreFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.score_fragment, null, false, component);
  }

  public static ScoreFragmentBinding bind(@NonNull View view) {
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
  public static ScoreFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ScoreFragmentBinding)bind(component, view, com.example.android.guesstheword.R.layout.score_fragment);
  }
}
