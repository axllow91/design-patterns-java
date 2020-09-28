package behavioral_pattern.visitor;

public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        // do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.printf("\nGood to see you %s", commander);
    }
}
