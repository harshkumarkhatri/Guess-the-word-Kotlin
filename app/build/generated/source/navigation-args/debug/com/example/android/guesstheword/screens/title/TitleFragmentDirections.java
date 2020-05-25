package com.example.android.guesstheword.screens.title;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.guesstheword.R;

public class TitleFragmentDirections {
  private TitleFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTitleToGame() {
    return new ActionOnlyNavDirections(R.id.action_title_to_game);
  }
}
