import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel {
  int boardWidth = 360;
  int boardHeight = 640;

  Image backgroundImg;
  Image birdImg;
  Image topPipeImg;
  Image bottomPipeImg;

  int birdX = boardWidth / 8;
  int birdY = boardWidth / 2;
  int birdWidth = 34;
  int birdHeight = 24;

  FlappyBird() {
    setPreferredSize(new Dimension(boardWidth, boardHeight));
    // setBackground(Color.blue);

    backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
    birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
    topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
    bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    draw(g);
  }

  public void draw(Graphics g) {
    g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
  }

}