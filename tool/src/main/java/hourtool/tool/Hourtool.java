package hourtool.tool;

import hourtool.swingui.MainWindow;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 30.12.12
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class Hourtool implements Runnable {

    private MainWindow window;

    public void run(){
        this.window = new MainWindow();
    }
    public static void main(String[] args){
        EventQueue.invokeLater(new Hourtool());
    }
}
