package com.mateuyabar.android.cleanbase;

import android.content.Intent;

/**
 * Created by mateuyabar on 23/10/15.
 */
public interface ActivityComponent extends Component {
    void onNewIntent(Intent intent);
}
