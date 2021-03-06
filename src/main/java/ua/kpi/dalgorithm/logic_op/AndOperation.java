package ua.kpi.dalgorithm.logic_op;

import ua.kpi.dalgorithm.signal.Signal;
import ua.kpi.dalgorithm.signal.SignalMath;

import static ua.kpi.dalgorithm.signal.Signal.ONE;

/**
 * Created on 07.03.2015
 *
 * @author Bohdan Vanchuhov
 */
public class AndOperation extends GenericLogicOperation {
    @Override
    protected int execute(int s1, int s2) {
        return s1 & s2;
    }

    @Override
    protected Signal execute(Signal s1, Signal s2) {
        return SignalMath.and(s1, s2);
    }

    @Override
    public Signal getUnimportantInput() {
        return ONE;
    }
}
