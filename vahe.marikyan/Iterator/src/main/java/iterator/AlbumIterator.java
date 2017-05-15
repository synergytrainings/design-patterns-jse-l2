package iterator;

import domain.Album;

/**
 * Created by VaheMarikyan on 5/14/17.
 */
public interface AlbumIterator {

    boolean hasNext();

    Album next();
}
