package chainofresponsibility.policy.politicians;

import chainofresponsibility.policy.lawact.LawAct;

public class PrimeMinister extends Politician {

    private String name;
    private final Position position = Position.PRIME_MINISTER;
    private Politician superiorPolitician;

    public PrimeMinister(String name) {
        this.name = name;
    }

    @Override
    public void signLawAct(LawAct lawAct) {
        if (lawAct.getPosition().equals(Position.PRIME_MINISTER)) {
            System.out.println("The prime minister " + name + " just sign the law act " + lawAct.getTitle());
        }else {
            getSuperiorPolitician().signLawAct(lawAct);
        }
    }

    @Override
    public void setSuperiorPolitician(Politician superiorPolitician) {
        super.setSuperiorPolitician(superiorPolitician);
    }

    @Override
    public Politician getSuperiorPolitician() {
        return super.getSuperiorPolitician();
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
