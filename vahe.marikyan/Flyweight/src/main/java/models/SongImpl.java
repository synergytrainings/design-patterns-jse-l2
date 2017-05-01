package models;

import interfaces.Song;

/**
 * Created by VaheMarikyan on 4/24/17.
 */
public class SongImpl implements Song {

    private final String songName;

    public SongImpl(String songName) {
        this.songName = songName;
        System.out.println("'" + songName + "'" + " is added to playlist.");
    }

    @Override
    public void playTrack() {
        System.out.println("Playing following track: " + this.songName);
    }

    public String getSongName() {
        return this.songName;
    }
}
