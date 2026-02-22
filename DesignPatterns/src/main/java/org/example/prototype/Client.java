package org.example.prototype;

public class Client {

    public static void populateRegistration(Registry registry)
    {

        NoteBook noteBook1 = new NoteBook();
        noteBook1.setType("plain");
        noteBook1.setHeight(100);
        noteBook1.setWidth(80);
        noteBook1.setPrice(80);
        noteBook1.setNoOfPages(100);

        registry.register("A4100pg",noteBook1);

        NoteBook noteBook2 = new NoteBook();
        noteBook2.setType("plain");
        noteBook2.setHeight(100);
        noteBook2.setWidth(80);
        noteBook2.setPrice(80);
        noteBook2.setNoOfPages(100);


        registry.register("A680pg",noteBook2);

        Origami origami = new Origami();
        origami.setType("plain");
        origami.setHeight(100);
        origami.setWidth(80);
        origami.setPrice(80);
        origami.setNoOfPages(100);
        origami.setOrigamiType("Tones");

        registry.register("Tones",origami);

    }

    public static void main(String[] args) {

        Registry registry = new Registry();

        populateRegistration(registry);

        NoteBook noteBook1 =  registry.get("A4100pg").clone();
        noteBook1.setFunFact("congress is going to win in 2024 elections");
        noteBook1.setCoverPage("waterfall scenary");

        NoteBook noteBook2 =  registry.get("Tones").clone();
        noteBook2.setCoverPage("chandigarh water fall");
        noteBook2.setFunFact("panda is lazy ");

        System.out.println("DEBUG");


    }

}
