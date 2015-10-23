package com.mateuyabar.android.mybase.clean.presentation.presenters;

import android.content.Intent;

import java.util.List;

/**
 * Prenseter that is compound of different presenters
 */
public class CompoundPresenter implements Presenter {
    List<Presenter> presenters;

    public CompoundPresenter(List<Presenter> presenters) {
        this.presenters = presenters;
    }


    @Override
    public void create() {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).create();
    }

    @Override
    public void resume() {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).resume();
    }

    @Override
    public void pause() {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).pause();
    }

    @Override
    public void stop() {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).stop();
    }

    @Override
    public void destroy() {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).destroy();
    }

    @Override
    public void newIntent(Intent intent) {
        for(int i=0; i<presenters.size(); ++i)
            presenters.get(i).newIntent(intent);
    }
}
