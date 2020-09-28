package behavioral_pattern.visitor;

public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.printf("\nGood to see you %s", sergeant);
    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
