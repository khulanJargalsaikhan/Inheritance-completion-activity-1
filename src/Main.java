public class Main {
    public static void main(String[] args){

        Book b = new Book();
        // use setters to set values
        b.setCode("001");
        b.setDescription("1984 tells the futuristic story of a dystopian.");
        b.setPrice(15.0);
        b.setAuthor("George Orwel");
        b.setPages(255);


        Book c = new Book();
        // use setters to set values
        c.setCode("002");
        c.setDescription("Tolkien’s fantasy epic is one of the top must-read books out there.");
        c.setPrice(25.0);
        c.setAuthor("J.R.R. Tolkien");
        c.setPages(306);


        Software s = new Software();
        // use setters to set values
        s.setCode("003");
        s.setDescription("With any Linux system, managing the system software is a major part of keeping the system working properly.");
        s.setPrice(100.0);
        s.setProgrammer("Linux Foundation");
        s.setPlatform("Linux");
        s.setOs("Unix");




        System.out.println(b.toString());
        System.out.println(b.toStringBook());
        System.out.println(c.toString());
        System.out.println(c.toStringBook());
        System.out.println(s.toString());
        System.out.println(s.toStringSoftware());
    }
}
