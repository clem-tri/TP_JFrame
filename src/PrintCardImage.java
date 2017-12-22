import game.Card;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PrintCardImage implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
       JList list = (JList) e.getSource();

       list.getSelectedValue();

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
