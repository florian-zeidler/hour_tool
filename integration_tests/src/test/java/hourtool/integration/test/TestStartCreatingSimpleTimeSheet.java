package hourtool.integration.test;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 04.01.13
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class TestStartCreatingSimpleTimeSheet extends BaseTestFixture {

    @Test
    @Ignore
    public void testCreatingASimpleTimeSheet() {
        fixture.spinner("start_date_spinner").enterText("01.01.13 16:16");
        fixture.spinner("stop_date_spinner").enterText("31.01.13 16:16");
        fixture.button("start_writing_file").click();
        // Check for created file
        File f = new File("stundenzettel.csv");
        Assert.assertTrue("The file with the hour page was not created.",f.exists());
        // Check for basic content of file.

        // Clean up
        if (f.exists()) {
            f.delete();
        }
    }
}
