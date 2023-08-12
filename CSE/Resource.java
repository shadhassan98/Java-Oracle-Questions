package CSE;

class Resource implements AutoCloseable {
    public void close() throws Exception {
        System.out.print ("Close-");
    }
    public void open() {
        System.out.print ("Open-");
    }
}

class ResourceMain {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        try {
            res1.open();
            res1.close();
        } 
        catch (Exception e) {
            System.out.println ("Exception — 1");
        }
        try (res1 = new Resource()) { // line nl
            res1.open();
        } 
        catch (Exception e) {
            System.out.println ("Exception —- 2");
        }
    }
}


