package com.mateuyabar.android.cleanbase;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;


public abstract class PresenterActivity extends AppCompatActivity {
    protected abstract Component getPresenter();

    @Override
    protected void onPause() {
        getPresenter().onPause();
        super.onPause();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getPresenter().onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    protected void onStop() {
        getPresenter().onStop();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        getPresenter().onDestroy();
        super.onDestroy();
    }
}
