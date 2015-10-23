package com.mateuyabar.android.cleanbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Base Fragment that has one Component (a Presenter).
 */
public abstract class PresenterFragment extends Fragment implements PresenterView{
    protected boolean acceptsComponent(Component component) {
        return !(component instanceof ActivityComponent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if(!acceptsComponent(getPresenter()))
            throw new UnsupportedOperationException("Presenter "+getPresenter().getClass()+" not supported in fragment "+getClass());
        getPresenter().onCreate();
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        getPresenter().onPause();
        super.onPause();
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    public void onStop() {
        getPresenter().onStop();
        super.onStop();
    }

    @Override
    public void onDestroy() {
        getPresenter().onDestroy();
        super.onDestroy();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        getPresenter().onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}
