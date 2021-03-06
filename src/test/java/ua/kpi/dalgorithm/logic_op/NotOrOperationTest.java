package ua.kpi.dalgorithm.logic_op;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created on 07.03.2015
 *
 * @author Bohdan Vanchuhov
 */
public class NotOrOperationTest {
    private LogicOperation notOrOperation;

    @Before
    public void setUp() throws Exception {
        notOrOperation = new NotOrOperation();
    }

    @Test
    public void execute_0() throws Exception {
        assertThat(notOrOperation.execute(1), is(0));
    }

    @Test
    public void execute_1() throws Exception {
        assertThat(notOrOperation.execute(0), is(1));
    }


    @Test
    public void execute_0_0() throws Exception {
        int result = notOrOperation.execute(0, 0);
        assertThat(result, is(1));
    }

    @Test
     public void execute_0_1() throws Exception {
        int result = notOrOperation.execute(0, 1);
        assertThat(result, is(0));
    }

    @Test
    public void execute_1_0() throws Exception {
        int result = notOrOperation.execute(1, 0);
        assertThat(result, is(0));
    }

    @Test
    public void execute_1_1() throws Exception {
        int result = notOrOperation.execute(0, 1);
        assertThat(result, is(0));
    }

    @Test(expected = IntIsNotSignalException.class)
    public void badInput_100() throws Exception {
        notOrOperation.execute(100);
    }
}
