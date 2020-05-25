package com.example.android.guesstheword.screens.score;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.guesstheword.R;

public class ScoreFragmentDirections {
  private ScoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRestart() {
    return new ActionOnlyNavDirections(R.id.action_restart);
  }
}
