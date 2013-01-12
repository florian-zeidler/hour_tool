package hourtool.swingui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 06.01.13
 * Time: 16:48
 * To change this template use File | Settings | File Templates.
 */
public class MainWindowActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(((JButton)actionEvent.getSource()).getName().equals("start_writing_file")){

        }
    }
}
