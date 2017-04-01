import javax.swing.*;
import java.awt.*;

/**
 * Created by TOM RED on 18.04.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Square square1 = SquareFactory.getFlyweightSquare(40, 40, Color.BLACK);
        Square square2 = SquareFactory.getFlyweightSquare(400, 400, Color.BLACK);
        Square square3 = SquareFactory.getFlyweightSquare(200,200, Color.BLUE);

        System.out.println("square1 == square2 is " + square1.equals(square2));
        System.out.println("square1 == square3 is " + square1.equals(square3));
        System.out.println("square2 == square3 is " + square1.equals(square3));

        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.checkSquares(square1, square2, square3);

    }
}
