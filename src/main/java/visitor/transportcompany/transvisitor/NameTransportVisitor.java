package visitor.transportcompany.transvisitor;

import visitor.transportcompany.transport.Animal;
import visitor.transportcompany.transport.Person;
import visitor.transportcompany.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println(animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println(person.getFristName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println(shipment.getPrefix()+ " " + shipment.getSerialNumber());
    }
}
