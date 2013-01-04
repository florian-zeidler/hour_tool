package hourtool.integration.test;

import hourtool.swingui.MainWindow;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 04.01.13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class BaseTestFixture {
    protected FrameFixture fixture;

    @Before
    public void init() {
        MainWindow window = GuiActionRunner.execute(new GuiQuery<MainWindow>() {
            @Override
            protected MainWindow executeInEDT() throws Throwable {
                return new MainWindow();  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        fixture = new FrameFixture(window);
        fixture.show();
    }

    @After
    public void tearDown() {
        fixture.cleanUp();
    }
}
