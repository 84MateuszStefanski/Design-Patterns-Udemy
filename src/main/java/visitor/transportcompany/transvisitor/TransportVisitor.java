package visitor.transportcompany.transvisitor;

import visitor.transportcompany.transport.Animal;
import visitor.transportcompany.transport.Person;
import visitor.transportcompany.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
