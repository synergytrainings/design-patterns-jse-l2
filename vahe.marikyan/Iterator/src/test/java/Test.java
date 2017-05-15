import collection.AlbumCollection;
import collection.AlbumCollectionImpl;
import domain.Album;
import domain.AlbumType;
import iterator.AlbumIterator;

/**
 * Created by VaheMarikyan on 5/14/17.
 */
public class Test {
    public static void main(String[] args) {

        AlbumCollection collection = new AlbumCollectionImpl();

        collection.addAlbum(new Album("Album 1", 2014, AlbumType.CD));
        collection.addAlbum(new Album("Album 2", 2005, AlbumType.VINYL));
        collection.addAlbum(new Album("Album 3", 1999, AlbumType.CASSETTE));
        collection.addAlbum(new Album("Album 2", 2005, AlbumType.CD));
        collection.addAlbum(new Album("Album 1", 2014, AlbumType.VINYL));
        collection.addAlbum(new Album("Album 4", 2016, AlbumType.CD));
        collection.addAlbum(new Album("Album 4", 2016, AlbumType.VINYL));
        collection.addAlbum(new Album("Album 5", 2013, AlbumType.CD));
        collection.addAlbum(new Album("Album 6", 2001, AlbumType.CASSETTE));

        AlbumIterator cdIterator = collection.getIterator(AlbumType.CD);
        while (cdIterator.hasNext()){
            Album album = cdIterator.next();
            System.out.println(album.toString());
        }

        System.out.println();

        AlbumIterator allIterator = collection.getIterator(AlbumType.ALL);
        while (allIterator.hasNext()){
            Album album = allIterator.next();
            System.out.println(album.toString());
        }
    }
}
