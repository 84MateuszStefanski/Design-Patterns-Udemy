package chainofresponsibility.policy.politicians;

import chainofresponsibility.policy.lawact.LawAct;

public class President extends Politician {

    private String name;
    private final Position position = Position.PRESIDENT;

    public President(String name) {
        this.name = name;
    }

    @Override
    public void signLawAct(LawAct lawAct) {
        if (lawAct.getPosition().equals(Position.PRESIDENT)) {
            System.out.println("The president " + name + " just sign the law act " + lawAct.getTitle());
        }else {
            getSuperiorPolitician().signLawAct(lawAct);
        }
    }

    @Override
    public Politician getSuperiorPolitician() {
        return super.getSuperiorPolitician();
    }

    @Override
    public void setSuperiorPolitician(Politician superiorPolitician) {
        super.setSuperiorPolitician(superiorPolitician);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Position getPosition() {
        return Position.valueOf(position.name());
    }
}
