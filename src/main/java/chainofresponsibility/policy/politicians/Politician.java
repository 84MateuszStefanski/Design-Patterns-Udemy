package chainofresponsibility.policy.politicians;


import chainofresponsibility.policy.lawact.LawAct;

public abstract class Politician {
    private String name;
    private Position position;
    private Politician superiorPolitician;

    public abstract void signLawAct(LawAct lawAct);

    public void setSuperiorPolitician(Politician superiorPolitician) {
        this.superiorPolitician = superiorPolitician;
    }

    public Politician getSuperiorPolitician() {
        return superiorPolitician;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
