import interfaces.Song;
import models.SongImpl;

import java.util.HashMap;

/**
 * Created by VaheMarikyan on 4/24/17.
 */
public class PlaylistFactory {

    private HashMap<String, Song> playlist = new HashMap<>();

    public Song getSong(String songName) {
        Song song = playlist.get(songName);

        if (song == null) {
            song = new SongImpl(songName);
            playlist.put(songName, song);
        }

        return song;
    }

    public int getTotalCountOfSongsAdded() {
        return playlist.size();
    }
}
