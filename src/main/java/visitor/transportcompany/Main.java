package visitor.transportcompany;

import visitor.transportcompany.transport.Animal;
import visitor.transportcompany.transport.Person;
import visitor.transportcompany.transport.Shipment;
import visitor.transportcompany.transport.Transportable;
import visitor.transportcompany.transvisitor.NameTransportVisitor;
import visitor.transportcompany.transvisitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach( namevisitor-> namevisitor.accept(nameTransportVisitor));
        transportableList.forEach(priceVisitor->priceVisitor.accept(priceTransportVisitor));
    }
}
