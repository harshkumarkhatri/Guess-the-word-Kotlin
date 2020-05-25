package com.example.android.guesstheword.screens.game;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.guesstheword.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static ActionGameToScore actionGameToScore() {
    return new ActionGameToScore();
  }

  public static class ActionGameToScore implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGameToScore() {
    }

    @NonNull
    public ActionGameToScore setScore(int score) {
      this.arguments.put("score", score);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("score")) {
        int score = (int) arguments.get("score");
        __result.putInt("score", score);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_game_to_score;
    }

    @SuppressWarnings("unchecked")
    public int getScore() {
      return (int) arguments.get("score");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameToScore that = (ActionGameToScore) object;
      if (arguments.containsKey("score") != that.arguments.containsKey("score")) {
        return false;
      }
      if (getScore() != that.getScore()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getScore();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameToScore(actionId=" + getActionId() + "){"
          + "score=" + getScore()
          + "}";
    }
  }
}
