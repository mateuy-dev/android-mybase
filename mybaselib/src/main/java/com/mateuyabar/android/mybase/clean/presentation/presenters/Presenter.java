package com.mateuyabar.android.mybase.clean.presentation.presenters;

import android.content.Intent;

/**
 * Interface representing a Presenter in a model view presenter (MVP) pattern.
 */
public interface Presenter {
  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onCreate() method.
   */
  void create();

  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onResume() method.
   */
  void resume();

  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onPause() method.
   */
  void pause();

  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onStop() method.
   */
  void stop();

  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onDestroy() method.
   */
  void destroy();

  /**
   * Method that control the lifecycle of the view. It should be called in the view's
   * (Activity or Fragment) onActivityNewIntent() method.
   * @param intent
   */
  void newIntent(Intent intent);
}