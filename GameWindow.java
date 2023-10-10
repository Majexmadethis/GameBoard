/**
 *
 * @author MAJEX
 */
import javax.swing.*;

public class GameWindow extends JFrame {
     
    private int winWid = 500;
    private int winHei = 500;
    
    private GameDisplay display;
    private GameLogic game;
    
    int rows = 8;
    int cols = 8;
    
    public GameWindow()
    {
        this.setTitle("My Game Board      MAJEX");
        this.setSize(winWid, winHei);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
        
        game = new GameLogic(rows,cols);
        display = new GameDisplay(game);
        this.add(display);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new GameWindow();
    }
    
}
