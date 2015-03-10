package ua.kpi.dalgorithm.signal;

import java.util.Arrays;

import static ua.kpi.dalgorithm.signal.Signal.*;

/**
 * Created on 07.03.2015
 *
 * @author Bohdan Vanchuhov
 */
public final class SignalMath {
    private SignalMath() {}

    public static Signal and(Signal s1, Signal s2) {
        if (s1 == ZERO || s2 == ZERO) {
            return ZERO;
        }
        return ONE;
    }

    public static Signal or(Signal s1, Signal s2) {
        if (s1 == ONE || s2 == ONE) {
            return ONE;
        }
        return ZERO;
    }

    public static Signal not(Signal s) {
        if (s == ZERO) {
            return ONE;
        }
        return ZERO;
    }

    public static Signal intersection(Signal s1, Signal s2) {
        if (s1 == ONE && s2 == ZERO) return D;
        if (s1 == ZERO && s2 == ONE) return NOT_D;
        if ((s1 == D && s2 == NOT_D) || (s1 == NOT_D && s2 == D)) return ZERO;
        if (s1 == s2) return s1;
        if (anyMatch(ZERO, s1, s2)) return ZERO;
        if (anyMatch(ONE, s1, s2)) return ONE;

        return UNDEFINED;
    }

    private static boolean anyMatch(Signal expected, Signal... signals) {
        return Arrays.stream(signals).anyMatch(s -> s == expected);
    }
}