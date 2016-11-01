package com.bignerdranch.android.geoquiz;

/**
 * Created by tom21 on 31/10/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textRedId, boolean answerTrue){
        mTextResId = textRedId;
        mAnswerTrue = answerTrue;


    }
}
