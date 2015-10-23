package com.mateuyabar.android.cleanbase;

import android.content.Context;

public interface Component {
    void onStart();
    void onResume();
    void onStop();
    void onDestroy();
    void onPause();
    void onCreate();
}
