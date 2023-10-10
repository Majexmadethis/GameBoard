/** Game Logic with data structure and two simple methods
 *
 * @author MAJEX
 */
public class GameLogic {
    private int [][] board;
    
    public GameLogic(int rows, int cols)
    {
        board = new int[rows][cols];
    }
    public int fetchPosition(int row, int col)
    {
         return board[row][col];      
    }
    
    public int fetchRows()
    {
         return board.length;      
    }
    
    public int fetchCols()
    {
        return board[0].length;
    }
    
    
}
