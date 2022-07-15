package mainFile.model;

public class Mailbox {
    private int id;
    private String language;
    private Integer size;
    private boolean spamsFillter;
    private String signature;

    public Mailbox() {
    }

    public Mailbox(int id, String language, Integer size, boolean spamsFillter, String signature) {
        this.id = id;
        this.language = language;
        this.size = size;
        this.spamsFillter = spamsFillter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean isSpamsFillter() {
        return spamsFillter;
    }

    public void setSpamsFillter(boolean spamsFillter) {
        this.spamsFillter = spamsFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
