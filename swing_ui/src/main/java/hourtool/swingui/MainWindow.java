package hourtool.swingui;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 30.12.12
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
public class MainWindow extends JFrame {

    public MainWindow(final MainWindowActionListener listener) {
        super("Hour Tool");
        this.setSize(new Dimension(250,100));
        GridBagLayout layout = new GridBagLayout();
        this.getContentPane().setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel startDate = new JLabel("start_date");
        startDate.setText("Start Datum");
        startDate.setName("start_date");
        this.getContentPane().add(startDate,constraints);
        constraints.gridy = 1;
        JSpinner startDateSpinner = new JSpinner(new SpinnerDateModel());
        startDateSpinner.setName("start_date_spinner");
        this.getContentPane().add(startDateSpinner,constraints);
        constraints.gridx =1;
        constraints.gridy =0;
        JLabel stop_date = new JLabel("End Datum");
        stop_date.setName("stop_date");
        this.getContentPane().add(stop_date,constraints);
        constraints.gridy = 1;
        JSpinner stopDateSpinner = new JSpinner(new SpinnerDateModel());
        stopDateSpinner.setName("stop_date_spinner");
        this.getContentPane().add(stopDateSpinner,constraints);
        constraints.gridx =0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        JButton writeFile = new JButton("Write file");
        writeFile.setName("start_writing_file");
        this.getContentPane().add(writeFile,constraints);
        this.setVisible(true);
    }
}
