package chainofresponsibility.policy;

import chainofresponsibility.policy.lawact.LawAct;
import chainofresponsibility.policy.politicians.*;

public class Main {

    public static void main(String[] args) {

        LawAct lawActOfGunPosses = new LawAct("The Gun Ownership Act","Every citizen has the right to possess a gun", Position.PRESIDENT);
        LawAct lawActOfCovid = new LawAct("Covid quarantine ", "I run a national quarantine until the epidemic ends", Position.MINISTER);
        Politician envoy = new Envoy("John Smith ");
        Politician minister = new Minister("Carl Evans ");
        Politician primeMinister = new PrimeMinister("Max Caruso ");
        Politician president = new President("Trevor Philips ");

        envoy.setSuperiorPolitician(minister);
        minister.setSuperiorPolitician(primeMinister);
        primeMinister.setSuperiorPolitician(president);

        president.signLawAct(lawActOfGunPosses);
        envoy.signLawAct(lawActOfCovid);
        envoy.signLawAct(lawActOfGunPosses);



    }
}
