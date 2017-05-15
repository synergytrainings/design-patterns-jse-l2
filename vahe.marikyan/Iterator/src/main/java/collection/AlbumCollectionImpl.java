package collection;

import domain.Album;
import domain.AlbumType;
import iterator.AlbumIterator;

import java.util.*;


/**
 * Created by VaheMarikyan on 5/14/17.
 */
public class AlbumCollectionImpl implements AlbumCollection {

    private List<Album> collection;

    public AlbumCollectionImpl() {
        this.collection = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        this.collection.add(album);
    }

    public void removeAlbum(Album album) {
        this.collection.remove(album);
    }

    public AlbumIterator getIterator(AlbumType type) {
        return new AlbumIteratorImpl(type, this.collection);
    }


    private class AlbumIteratorImpl implements AlbumIterator {

        private AlbumType albumType;

        private List<Album> albums;

        private int position;


        public AlbumIteratorImpl(AlbumType albumType, List<Album> albums) {
            this.albumType = albumType;
            this.albums = albums;
        }


        public boolean hasNext() {
            while (position < albums.size()) {
                Album album = albums.get(position);
                if (album.getAlbumType().equals(albumType) || albumType.equals(AlbumType.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        public Album next() {
            Album album = albums.get(position);
            position++;

            return album;
        }
    }
}
