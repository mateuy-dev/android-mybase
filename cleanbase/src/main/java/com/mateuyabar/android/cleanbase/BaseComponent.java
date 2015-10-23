package com.mateuyabar.android.cleanbase;


import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of Component.
 * It contains a list of subcomponents, that can be updated with addComponent method
 */
public class BaseComponent implements Component {
    List<Component> components = new ArrayList<>();
    Context context;

    public BaseComponent(Context context) {
        this.context = context;
    }

    public void addComponent(Component component){
        if(!acceptsComponent(component))
            throw new UnsupportedOperationException("Component "+component.getClass()+" not supported in "+getClass());
        components.add(component);
    }

    protected boolean acceptsComponent(Component component) {
        return !(component instanceof ActivityComponent);
    }

    public Context getContext() {
        return context;
    }

    @Override
    public void onPause() {
        for(int i=components.size()-1; i>=0; i--){
            components.get(i).onPause();
        }
    }

    @Override
    public void onCreate() {
        for(int i=0; i<components.size(); i++){
            components.get(i).onCreate();
        }
    }

    @Override
    public void onStart() {
        for(int i=0; i<components.size(); i++){
            components.get(i).onStart();
        }
    }

    @Override
    public void onResume() {
        for(int i=0; i<components.size(); i++){
            components.get(i).onResume();
        }
    }

    @Override
    public void onStop() {
        for(int i=components.size()-1; i>=0; i--){
            components.get(i).onStop();
        }
    }

    @Override
    public void onDestroy() {
        for(int i=components.size()-1; i>=0; i--){
            components.get(i).onDestroy();
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        for(int i=0; i<components.size(); i++){
            components.get(i).onActivityResult(requestCode, resultCode, data);
        }
    }
}
