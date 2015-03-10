package ua.kpi.dalgorithm;

import org.junit.Test;
import ua.kpi.dalgorithm.signal.SignalMath;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ua.kpi.dalgorithm.signal.Signal.*;

/**
 * Created on 08.03.2015
 *
 * @author Bohdan Vanchuhov
 */
public class IntersectionTest {
    @Test
    public void test_0_0() throws Exception {
        assertThat(SignalMath.intersection(ZERO, ZERO), is(ZERO));
    }

    @Test
    public void test_0_U() throws Exception {
        assertThat(SignalMath.intersection(ZERO, UNDEFINED), is(ZERO));
    }

    @Test
    public void test_U_0() throws Exception {
        assertThat(SignalMath.intersection(UNDEFINED, ZERO), is(ZERO));
    }

    //--------------------------------------------------

    @Test
    public void test_1_D() throws Exception {
        assertThat(SignalMath.intersection(ONE, D), is(ONE));
    }

    @Test
    public void test_1_U() throws Exception {
        assertThat(SignalMath.intersection(ONE, UNDEFINED), is(ONE));
    }

    @Test
    public void test_U_1() throws Exception {
        assertThat(SignalMath.intersection(UNDEFINED, ONE), is(ONE));
    }

    //--------------------------------------------------

    @Test
    public void test_D_D() throws Exception {
        assertThat(SignalMath.intersection(D, D), is(D));
    }

    @Test
    public void test_d_d() throws Exception {
        assertThat(SignalMath.intersection(NOT_D, NOT_D), is(NOT_D));
    }

    @Test
    public void test_1_0() throws Exception {
        assertThat(SignalMath.intersection(ONE, ZERO), is(D));
    }

    @Test
    public void test_0_1() throws Exception {
        assertThat(SignalMath.intersection(ZERO, ONE), is(NOT_D));
    }
}
