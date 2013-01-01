package hourtool.swingui;

import javax.swing.*;
import java.awt.*;

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
        //this.setSize(new Dimension(640,480));
        JLabel start_date = new JLabel("start_date");
        start_date.setText("Start Datum");
        start_date.setName("start_date");
        this.getContentPane().add(start_date);
        this.setVisible(true);
        JSpinner startDateSpinner = new JSpinner(new SpinnerDateModel());
        startDateSpinner.setName("start_date_spinner");
        this.getContentPane().add(startDateSpinner);
        JLabel stop_date = new JLabel("End Datum");
        stop_date.setName("stop_date");
        this.getContentPane().add(stop_date);
    }
}
