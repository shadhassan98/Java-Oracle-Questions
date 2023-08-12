package CSE;

class Book2 {
    int id;
    String name;
    public Book2 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals (Object obj) { //line n1
        boolean output = false;
        Book2 b = (Book2) obj;
        if (this.name.equals(b.name)){
            output = true;
        }
        return output;
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2 (101, "Java Programing");
        Book2 b2 = new Book2 (102, "Java Programing");
        System.out.println (b1.equals(b2)); //line n2
    }
}

