package chainofresponsibility.children;

public class Ania extends Child {



    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

    @Override
    public Child getTallerChild() {
        return super.getTallerChild();
    }
}
