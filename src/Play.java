import game.Card;
import game.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Play implements MouseListener {

    JLabel rightPanel;
    private static final String PATH_TO_IMG = System.getProperty("user.dir")+"\\data\\images\\";

    public Play(){
        Game game = new Game();;
        game.getJsonDeck();

        JFrame window = new JFrame("Play Pokemon");
        GridLayout grid = new GridLayout(0,2);
        window.setLayout(grid);
        grid.layoutContainer(window);


        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black)));

        DefaultListModel<Card> list = new DefaultListModel<>();

        for(Card card : game.getP1().getDecks().get(0).getCards()){
            list.addElement(card);
        }

        JList cardsList = new JList<>(list);
        cardsList.addMouseListener(this);

        JScrollPane scrollableList = new JScrollPane(cardsList);
        leftPanel.add(scrollableList);


        rightPanel = new JLabel();
        rightPanel.setHorizontalAlignment(JLabel.CENTER);
        rightPanel.setHorizontalTextPosition(JLabel.CENTER);
        rightPanel.setVerticalTextPosition(JLabel.BOTTOM);
        rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black)));





        window.add(leftPanel);
        window.add(rightPanel);

        window.setSize(900,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }



    public static void main(String[] args) {

        Play play = new Play();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JList list = (JList)e.getSource();
        Card selectedCard = (Card)list.getSelectedValue();
        ImageIcon img = new ImageIcon(PATH_TO_IMG+selectedCard.toString()+".jpg");
        Image image = img.getImage(); // transform it
        Image newimg = image.getScaledInstance(250, 350,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        img = new ImageIcon(newimg);  // transform it back
        this.rightPanel.setText(selectedCard.getType()+" "+selectedCard.getHealth_points()+" HP");

        this.rightPanel.setIcon(img);



    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
