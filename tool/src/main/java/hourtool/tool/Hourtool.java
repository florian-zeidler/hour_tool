package hourtool.tool;

import hourtool.swingui.MainWindow;
import hourtool.swingui.MainWindowActionListener;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 30.12.12
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class Hourtool implements Runnable {

    /**
     * Pointer to the main window.
     */
    private MainWindow window;

    /**
     * Pointer to the Action Listener.
     */
    private MainWindowActionListener listener;

    @Override
    public final void run() {
        this.listener = new MainWindowActionListener();
        this.window = new MainWindow(listener);
    }

    /**
     * This starts the whole thing.
     *
     * @param args Parameters from the command line.
     */
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Hourtool());
    }
}
