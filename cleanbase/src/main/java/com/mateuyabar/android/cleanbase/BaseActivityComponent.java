package com.mateuyabar.android.cleanbase;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by mateuyabar on 23/10/15.
 */
public class BaseActivityComponent extends  BaseComponent implements ActivityComponent {

    public BaseActivityComponent(Activity context) {
        super(context);
    }

    @Override
    public void onNewIntent(Intent intent) {
        for(int i=0; i<components.size(); i++){
            Component component = components.get(i);
            if(component instanceof ActivityComponent)
                ((ActivityComponent)components.get(i)).onNewIntent(intent);
        }
    }

    @Override
    protected boolean acceptsComponent(Component component) {
        return true;
    }
}
