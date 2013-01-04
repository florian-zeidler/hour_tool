package hourtool.integration.test;

import hourtool.swingui.MainWindow;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 30.12.12
 * Time: 20:59
 * To change this template use File | Settings | File Templates.
 */
public class TestApplicationStart extends BaseTestFixture {

    @Test
    public void testWindowExistsAndIsShown() {
        fixture.requireEnabled();
        fixture.label("start_date").requireText("Start Datum");
        fixture.spinner("start_date_spinner").requireEnabled();
        fixture.label("stop_date").requireText("End Datum");
        fixture.spinner("stop_date_spinner").requireEnabled();
        fixture.button("start_writing_file").requireEnabled();
    }
}
