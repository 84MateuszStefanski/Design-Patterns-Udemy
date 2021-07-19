package visitor.transportcompany.transvisitor;

import visitor.transportcompany.transport.Animal;
import visitor.transportcompany.transport.Person;
import visitor.transportcompany.transport.Shipment;

public class PriceTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("The price for animal transport is :" + animal.getWeight()*0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if(person.isRegularCustomer()) {
            price /= 2;
        }
        System.out.println("The price for person transport is :" + price + "$");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.println("The shipment cost :" + price);
    }
}
