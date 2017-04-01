import javax.swing.*;
import java.awt.*;

/**
 * Created by TOM RED on 01.04.2017.
 */
public class MyFrame extends JFrame {

    private Square square1 = SquareFactory.getFlyweightSquare(40, 40, Color.BLACK);
    private Square square2 = SquareFactory.getFlyweightSquare(400, 400, Color.BLACK);
    private Square square3 = SquareFactory.getFlyweightSquare(200, 200, Color.BLUE);

    public MyFrame() {

        setSize(600, 600);
        setVisible(true);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //drawing square1
        g.setColor(square1.getColor());
        g.fillRect(square1.getStartPointX(), square1.getStartPointY(), square1.getWidth(), square1.getHeight());

        //drawing square2
        g.setColor(square2.getColor());
        g.fillRect(square2.getStartPointX(), square2.getStartPointY(), square2.getWidth(), square2.getHeight());

        //drawing square3
        g.setColor(square3.getColor());
        g.fillRect(square3.getStartPointX(), square3.getStartPointY(), square3.getWidth(), square3.getHeight());

    }

    public void checkSquares(Square square1, Square square2, Square square3) {

        System.out.println("this.square1 == square1 is " + this.square1.equals(square1));
        System.out.println("this.square2 == square2 is " + this.square2.equals(square2));
        System.out.println("this.square3 == square3 is " + this.square3.equals(square3));
    }
}
