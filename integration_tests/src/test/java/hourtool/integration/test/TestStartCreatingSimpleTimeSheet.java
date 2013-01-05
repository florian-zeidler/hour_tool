package hourtool.integration.test;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * Created with IntelliJ IDEA.
 * User: florianzeidler
 * Date: 04.01.13
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class TestStartCreatingSimpleTimeSheet extends BaseTestFixture {

    @Test
    public void testCreatingASimpleTimeSheet(){
        fixture.spinner("start_date_spinner").enterText("01.01.13 16:16");
        fixture.spinner("stop_date_spinner").enterText("31.01.13 16:16");
        fixture.button("start_writing_file").click();
    }
}
