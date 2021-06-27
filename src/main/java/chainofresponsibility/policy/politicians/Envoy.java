package chainofresponsibility.policy.politicians;

import chainofresponsibility.policy.lawact.LawAct;

public class Envoy extends Politician {

    private String name;
    private Position position = Position.ENVOY;


    public Envoy(String name) {
        this.name = name;
    }

    @Override
    public void signLawAct(LawAct lawAct) {
        if (lawAct.getPosition().equals(Position.ENVOY)) {
            System.out.println("The envoy " + name + " just sign the law act " + lawAct.getTitle());
        } else {
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


    public String getName() {
        return name;
    }


    public Position getPosition() {
        return Position.valueOf(position.name());
    }
}
