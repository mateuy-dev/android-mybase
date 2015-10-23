package com.mateuyabar.android.cleanbaselib;

import android.content.Context;

import com.mateuyabar.android.cleanbase.BaseComponent;


public class SamplePresenter extends BaseComponent {
    ViewRenderer view;

    public SamplePresenter(Context context, ViewRenderer view) {
        super(context);
        this.view = view;
    }

    @Override
    public void onStart() {
        view.displayMessage("Starting");
    }

    @Override
    public void onPause() {
        view.displayMessage("Pausing");
    }

    public interface ViewRenderer{
        void displayMessage(String message);
    }
}
