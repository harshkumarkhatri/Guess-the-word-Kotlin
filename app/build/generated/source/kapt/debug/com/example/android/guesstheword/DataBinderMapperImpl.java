package com.example.android.guesstheword;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.guesstheword.databinding.GameFragmentBindingImpl;
import com.example.android.guesstheword.databinding.ScoreFragmentBindingImpl;
import com.example.android.guesstheword.databinding.TitleFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_GAMEFRAGMENT = 1;

  private static final int LAYOUT_SCOREFRAGMENT = 2;

  private static final int LAYOUT_TITLEFRAGMENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.guesstheword.R.layout.game_fragment, LAYOUT_GAMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.guesstheword.R.layout.score_fragment, LAYOUT_SCOREFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.guesstheword.R.layout.title_fragment, LAYOUT_TITLEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_GAMEFRAGMENT: {
          if ("layout/game_fragment_0".equals(tag)) {
            return new GameFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for game_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SCOREFRAGMENT: {
          if ("layout/score_fragment_0".equals(tag)) {
            return new ScoreFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for score_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TITLEFRAGMENT: {
          if ("layout/title_fragment_0".equals(tag)) {
            return new TitleFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for title_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "gameViewModel");
      sKeys.put(2, "scoreViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/game_fragment_0", com.example.android.guesstheword.R.layout.game_fragment);
      sKeys.put("layout/score_fragment_0", com.example.android.guesstheword.R.layout.score_fragment);
      sKeys.put("layout/title_fragment_0", com.example.android.guesstheword.R.layout.title_fragment);
    }
  }
}
