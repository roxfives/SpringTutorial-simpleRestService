package responses;

public class Greeting {
    private final long ID;
    private final String CONTENT;

    public Greeting(long id, String content) {
        this.ID = id;
        this.CONTENT = content;
    }

    public long getID() {
        return this.ID;
    }

    public String getCONTENT() {
        return this.CONTENT;
    }
}
