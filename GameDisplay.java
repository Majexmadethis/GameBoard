  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAJEX
 */
import javax.swing.*;
import java.awt.*;

public class GameDisplay extends JPanel 
{
    private int cellSize = 40;
    private int startX = 20;
    private int startY = 20;
    
    private Color[] colors = {Color.green, Color.black};
    
    private GameLogic game;
    
    public GameDisplay(GameLogic gam)
    {
        game = gam;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int x;
        int y = startY;
        
        for(int row = 0; row < game.fetchRows(); row++)
        {
            x = startX;
            
            for(int col = 0; col < game.fetchCols(); col++)
            {
                g.setColor(colors[(row+col)%2]);
                g.fillRect(x, y, cellSize, cellSize);
                x += cellSize;
            }
            y += cellSize;
        }
    }
    
}
