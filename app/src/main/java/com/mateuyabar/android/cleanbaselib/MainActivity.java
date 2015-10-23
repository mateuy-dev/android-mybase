package com.mateuyabar.android.cleanbaselib;

import android.os.Bundle;
import android.widget.Toast;

import com.mateuyabar.android.cleanbase.Component;
import com.mateuyabar.android.cleanbase.PresenterActivity;

public class MainActivity extends PresenterActivity implements SamplePresenter.ViewRenderer{
    Component presenter = new SamplePresenter(this, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected Component getPresenter() {
        return presenter;
    }

    @Override
    public void displayMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
