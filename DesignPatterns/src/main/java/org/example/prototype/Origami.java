package org.example.prototype;

public class Origami extends NoteBook{
    private String origamiType;

    public Origami() {
    }
    public Origami(Origami origami) {
        super(origami);
        this.origamiType = origami.origamiType;
    }

    public String getOrigamiType() {
        return origamiType;
    }

    public void setOrigamiType(String origamiType) {
        this.origamiType = origamiType;
    }

    @Override
    public NoteBook clone() {
        return new Origami(this);
    }

}
