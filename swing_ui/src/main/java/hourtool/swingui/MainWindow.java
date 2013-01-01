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

    public MainWindow() {
        super("Hour Tool");
        //this.setSize(new Dimension(640,480));
        JLabel startDate = new JLabel("start_date");
        startDate.setText("Start Datum");
        startDate.setName("start_date");
        this.getContentPane().add(startDate);
        JSpinner startDateSpinner = new JSpinner(new SpinnerDateModel());
        startDateSpinner.setName("start_date_spinner");
        this.getContentPane().add(startDateSpinner);
        JLabel stop_date = new JLabel("End Datum");
        stop_date.setName("stop_date");
        this.getContentPane().add(stop_date);
        JSpinner stopDateSpinner = new JSpinner(new SpinnerDateModel());
        stopDateSpinner.setName("stop_date_spinner");
        this.getContentPane().add(stopDateSpinner);
        this.setVisible(true);
    }
}
