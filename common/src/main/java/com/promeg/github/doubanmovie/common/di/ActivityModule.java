package com.promeg.github.doubanmovie.common.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
public class ActivityModule {
  private final Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  /**
  * Expose the provideActivity to dependents in the graph.
  */
  @Provides @PerActivity
  Activity provideActivity() {
    return this.activity;
  }
}
