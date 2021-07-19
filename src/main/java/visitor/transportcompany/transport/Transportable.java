package visitor.transportcompany.transport;

import visitor.transportcompany.transvisitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor visitor);
}
