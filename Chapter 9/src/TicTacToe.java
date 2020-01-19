import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JPanel {

    char[][] arr = new char[3][3];

    public TicTacToe(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                arr[i][j] = ' ';
        }
        setBackground(Color.white);
    }

    public char getSign(int row, int column) {
        return arr[row][column];
    }

    public void placeSign(char sign, int row, int column){
        arr[row][column] = sign;
        repaint();
    }

    public void moveSign(int rowFrom, int columnFrom, int rowTo, int columnTo){
        arr[rowTo][columnTo] = arr[rowFrom][columnFrom];
        arr[rowFrom][columnFrom] = ' ';
        repaint();
    }

    public char winner(){
        //Check Diagonal for equal signs
        if(arr[0][0] != ' ' && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
            return arr[0][0];
        if(arr[0][2] != ' ' && arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0])
            return arr[0][2];
         //Check Rows
        for(int i = 0; i < 3; i++)
            if(arr[i][0] != ' ' && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
                return arr[i][0];
        for(int j = 0; j < 3; j++)
            if(arr[0][j] != ' ' && arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j])
                return arr[0][j];
        return ' ';
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Draw rectangles for the 3x3 matrix
        int x = getWidth() / 3;
        int y = getHeight() / 3;
        for(int m = 0; m < 3; m++)
            for(int n = 0; n < 3; n++){
                g.drawRect(n*x, m*y, x, y);
                if(arr[m][n] == 'x'){
                    g.drawLine(n*x, m*y, (n+1)*x, (m+1)*y);
                    g.drawLine((n+1)*x, n*y, n*x, (m+1)*y);
                }
            }
    }
}