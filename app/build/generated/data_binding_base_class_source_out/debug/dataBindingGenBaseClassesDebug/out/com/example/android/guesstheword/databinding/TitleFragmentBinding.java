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

public abstract class TitleFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView getReadyText;

  @NonNull
  public final Button playGameButton;

  @NonNull
  public final ConstraintLayout titleLayout;

  @NonNull
  public final TextView titleText;

  protected TitleFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView getReadyText, Button playGameButton, ConstraintLayout titleLayout,
      TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.getReadyText = getReadyText;
    this.playGameButton = playGameButton;
    this.titleLayout = titleLayout;
    this.titleText = titleText;
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.title_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TitleFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.title_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.title_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TitleFragmentBinding>inflateInternal(inflater, com.example.android.guesstheword.R.layout.title_fragment, null, false, component);
  }

  public static TitleFragmentBinding bind(@NonNull View view) {
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
  public static TitleFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (TitleFragmentBinding)bind(component, view, com.example.android.guesstheword.R.layout.title_fragment);
  }
}
