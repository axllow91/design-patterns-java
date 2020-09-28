package behavioral_pattern.visitor;

public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.printf("\nGood to see you %s", soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
