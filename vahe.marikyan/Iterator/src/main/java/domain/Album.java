package domain;

/**
 * Created by VaheMarikyan on 5/14/17.
 */
public class Album {

    private String name;

    private Integer year;

    private AlbumType albumType;


    public Album(String name, Integer year, AlbumType albumType) {
        this.name = name;
        this.year = year;
        this.albumType = albumType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public AlbumType getAlbumType() {
        return albumType;
    }

    public void setAlbumType(AlbumType albumType) {
        this.albumType = albumType;
    }

    @Override
    public String toString() {
        return "Album { " +
                "name: '" + name + '\'' +
                ", year: " + year +
                ", albumType: " + albumType +
                " }";
    }
}
