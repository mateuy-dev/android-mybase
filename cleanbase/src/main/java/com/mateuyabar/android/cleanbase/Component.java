package com.mateuyabar.android.cleanbase;

import android.content.Intent;

/**
 * Component that responds to Activity life cycle
 */
public interface Component {
    void onStart();
    void onResume();
    void onStop();
    void onDestroy();
    void onPause();
    void onCreate();
    void onActivityResult(int requestCode, int resultCode, Intent data);
}
