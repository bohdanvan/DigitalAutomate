package ua.kpi.dalgorithm.logic_op;

/**
 * Created on 07.03.2015
 *
 * @author Bohdan Vanchuhov
 */
public class NotAndOperation extends InvertingLogicOperation {
    @Override
    protected LogicOperation getNotInvertingLogicElement() {
        return LogicOperations.AND;
    }
}
