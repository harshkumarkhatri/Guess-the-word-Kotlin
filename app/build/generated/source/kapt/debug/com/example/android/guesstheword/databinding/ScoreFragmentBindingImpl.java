package com.example.android.guesstheword.databinding;
import com.example.android.guesstheword.R;
import com.example.android.guesstheword.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ScoreFragmentBindingImpl extends ScoreFragmentBinding implements com.example.android.guesstheword.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.you_scored_text, 3);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ScoreFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ScoreFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.playAgainButton.setTag(null);
        this.scoreLayout.setTag(null);
        this.scoreText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.android.guesstheword.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.scoreViewModel == variableId) {
            setScoreViewModel((com.example.android.guesstheword.screens.score.ScoreViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setScoreViewModel(@Nullable com.example.android.guesstheword.screens.score.ScoreViewModel ScoreViewModel) {
        this.mScoreViewModel = ScoreViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.scoreViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeScoreViewModelScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeScoreViewModelScore(androidx.lifecycle.LiveData<java.lang.Integer> ScoreViewModelScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer scoreViewModelScoreGetValue = null;
        java.lang.String stringValueOfScoreViewModelScore = null;
        com.example.android.guesstheword.screens.score.ScoreViewModel scoreViewModel = mScoreViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> scoreViewModelScore = null;
        int androidxDatabindingViewDataBindingSafeUnboxScoreViewModelScoreGetValue = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (scoreViewModel != null) {
                    // read scoreViewModel.score
                    scoreViewModelScore = scoreViewModel.getScore();
                }
                updateLiveDataRegistration(0, scoreViewModelScore);


                if (scoreViewModelScore != null) {
                    // read scoreViewModel.score.getValue()
                    scoreViewModelScoreGetValue = scoreViewModelScore.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(scoreViewModel.score.getValue())
                androidxDatabindingViewDataBindingSafeUnboxScoreViewModelScoreGetValue = androidx.databinding.ViewDataBinding.safeUnbox(scoreViewModelScoreGetValue);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(scoreViewModel.score.getValue()))
                stringValueOfScoreViewModelScore = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxScoreViewModelScoreGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.playAgainButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.scoreText, stringValueOfScoreViewModelScore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // scoreViewModel != null
        boolean scoreViewModelJavaLangObjectNull = false;
        // scoreViewModel
        com.example.android.guesstheword.screens.score.ScoreViewModel scoreViewModel = mScoreViewModel;



        scoreViewModelJavaLangObjectNull = (scoreViewModel) != (null);
        if (scoreViewModelJavaLangObjectNull) {


            scoreViewModel.onPlayAgain();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): scoreViewModel.score
        flag 1 (0x2L): scoreViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}