package hourtool.swingui;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 30.12.12
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        super("Hour Tool");
        JLabel start_date = new JLabel("start_date");
        start_date.setText("Start Datum");
        start_date.setName("start_date");
        this.getContentPane().add(start_date);

    }
}
