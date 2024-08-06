import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;



public class FlappyBird extends JPanel {

    int boardwidth = 360;
    int boardheight = 640;

    //Images

    Image background;
    Image birdImage;
    Image topPipeImg;
    Image bottomPipeImg;


    FlappyBird() {
        setPreferredSize(new Dimension(boardwidth, boardheight));
        //setBackground(Color.blue);


        //load images

        background = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("bottomPipe.png")).getImage();



    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }



    public void draw(Graphics g) {
        //draw background
        g.drawImage(background, 0, 0, boardwidth, boardheight, null);

    }

    
    
}

