package collection;

import domain.Album;
import domain.AlbumType;
import iterator.AlbumIterator;

/**
 * Created by VaheMarikyan on 5/14/17.
 */
public interface AlbumCollection {

    void addAlbum(Album album);

    void removeAlbum(Album album);

    AlbumIterator getIterator(AlbumType type);
}
