package com.mateuyabar.android.mybase.clean.presentation.presenters;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by mateuyabar on 10/19/15.
 */
public abstract class PresenterActivity extends FragmentActivity {
    Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getPresenter().create();
    }

    @Override
    protected void onPause() {
        getPresenter().pause();
        super.onPause();
    }

    @Override
    protected void onStop() {
        getPresenter().stop();
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().resume();
    }

    @Override
    protected void onDestroy() {
        getPresenter().destroy();
        super.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getPresenter().newIntent(intent);
    }

    public abstract Presenter getPresenter();
}
