package com.example.android.classicalmusicquiz;

import android.support.v4.media.session.MediaSessionCompat;

/**
 * Created by Sergio on 26/03/2018.
 * Allow external apps to use the exoplayer?
 */

class QuizMediaSessionCallBacks extends MediaSessionCompat.Callback {
    /**
     * Override to handle requests to begin playback.
     */
    @Override
    public void onPlay() {
        super.onPlay();
    }

    /**
     * Override to handle requests to pause playback.
     */
    @Override
    public void onPause() {
        super.onPause();
    }

    /**
     * Override to handle requests to skip to the previous media item.
     */
    @Override
    public void onSkipToPrevious() {
        super.onSkipToPrevious();
    }
}
