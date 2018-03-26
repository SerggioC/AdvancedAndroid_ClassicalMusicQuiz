package com.example.android.classicalmusicquiz;

import android.support.v4.media.session.MediaSessionCompat;

import com.google.android.exoplayer2.SimpleExoPlayer;

import timber.log.Timber;

/**
 * Created by Sergio on 26/03/2018.
 * Allow external apps to use the exoplayer?
 */

class QuizMediaSessionCallBacks extends MediaSessionCompat.Callback {
    SimpleExoPlayer mExoPlayer;

    public QuizMediaSessionCallBacks(SimpleExoPlayer mExoPlayer) {
        this.mExoPlayer = mExoPlayer;
    }

    /**
     * Override to handle requests to begin playback.
     */
    @Override
    public void onPlay() {
        super.onPlay();
        mExoPlayer.setPlayWhenReady(true);
        Timber.i("QuizMediaSessionCallBacks onPlay");
    }

    /**
     * Override to handle requests to pause playback.
     */
    @Override
    public void onPause() {
        super.onPause();
        mExoPlayer.setPlayWhenReady(false);
        Timber.i("QuizMediaSessionCallBacks onPause");
    }

    /**
     * Override to handle requests to skip to the previous media item.
     */
    @Override
    public void onSkipToPrevious() {
        super.onSkipToPrevious();
        mExoPlayer.seekTo(0);
        Timber.i("QuizMediaSessionCallBacks onSkipToPrevious");

    }
}
