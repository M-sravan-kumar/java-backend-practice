package org.example.prototype;

public class NoteBook implements ProtoType<NoteBook>{

    private int noOfPages;
    private double price;
    private String Type;
    private int height;
    private int width;
    private String funFact;
    private String coverPage;

    public NoteBook() {
    }
    public NoteBook(NoteBook noteBook) {
        this.Type = noteBook.Type;
        this.width = noteBook.width;
        this.price = noteBook.price;
        this.noOfPages = noteBook.height;
        this.height = noteBook.height;
    }

    @Override
    public NoteBook clone() {
//        NoteBook noteBook = new NoteBook();
//        noteBook.height = height;
//        noteBook.width = width;
//        noteBook.price = price;
//        noteBook.noOfPages = noOfPages;
//        noteBook.Type = Type;

        return new NoteBook(this);
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getCoverPage() {
        return coverPage;
    }

    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }


}
