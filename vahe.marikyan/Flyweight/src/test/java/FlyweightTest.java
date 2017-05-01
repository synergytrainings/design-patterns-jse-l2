import interfaces.Song;

/**
 * Created by VaheMarikyan on 4/24/17.
 */
public class FlyweightTest {

    private static PlaylistFactory playlistFactory;
    private static int requestCount = 0;
    private static final Song[] songs = new Song[30];

    public static void addRequestedSongInQueue(String songName) {
        songs[requestCount] = playlistFactory.getSong(songName);
        requestCount++;
    }

    public static void main(String[] args) {
        playlistFactory = new PlaylistFactory();

        addRequestedSongInQueue("Track 1");
        addRequestedSongInQueue("Track 2");
        addRequestedSongInQueue("Track 3");
        addRequestedSongInQueue("Track 4");
        addRequestedSongInQueue("Track 5");
        addRequestedSongInQueue("Track 1");
        addRequestedSongInQueue("Track 6");
        addRequestedSongInQueue("Track 2");
        addRequestedSongInQueue("Track 4");

        for (int i = 0; i < requestCount; i++) {
            songs[i].playTrack();
        }

        System.out.println("\n Total songs added in playlist " + playlistFactory.getTotalCountOfSongsAdded() +
                "\n Total songs played: " + requestCount);
    }
}
