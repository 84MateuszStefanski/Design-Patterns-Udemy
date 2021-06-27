package chainofresponsibility.policy.lawact;

import chainofresponsibility.policy.politicians.Position;

public class LawAct {

    private String title;
    private String content;
    private Position position;

    public LawAct(String title, String content, Position position) {
        this.title = title;
        this.content = content;
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Position getPosition() {
        return position;
    }
}
