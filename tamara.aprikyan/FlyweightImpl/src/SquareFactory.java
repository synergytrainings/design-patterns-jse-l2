import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * SquareFactory class to create squares with properties.
 * If square with those properties already exists, it doesn't create new square,
 * instead it returns already existed square.
 * <p>
 * Created by tamara.aprikyan on 4/20/2017.
 */
public class SquareFactory {

    //to hold already created squares
    private static List<Square> cacheSquares = new ArrayList<>();

    public static Square getFlyweightSquare(int startPointX, int startPointY, Color color) {
        Square square = getCachedSquare(startPointX, startPointY, color);

        if (square == null) {
            square = new Square(startPointX, startPointY, color);
            cacheSquares.add(square);
        }

        return square;
    }

    private static Square getCachedSquare(int startPointX, int startPointY, Color color) {
        for (Square square : cacheSquares) {
            if (square.haveTheSameProperties(startPointX, startPointY, color)) {
                return square;
            }
        }

        return null;
    }
}
