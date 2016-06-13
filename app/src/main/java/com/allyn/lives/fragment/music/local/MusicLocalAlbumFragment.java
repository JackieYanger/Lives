package com.allyn.lives.fragment.music.local;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allyn.lives.R;
import com.allyn.lives.fragment.base.BaseFragment;


public class MusicLocalAlbumFragment extends BaseFragment {

    public static MusicLocalAlbumFragment newInstance() {
        MusicLocalAlbumFragment musicLocalAlbumFragment = new MusicLocalAlbumFragment();
        return musicLocalAlbumFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music_local_album, container, false);
    }
}
