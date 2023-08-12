package CSE;

 class Engine {
    double fuelLevel;
    Engine (int fuelLevel) { this.fuelLevel = fuelLevel; }
    public void start() {
        //line n1
        assert(fuelLevel > 0) : "Impossible fuel";
        System.out.println("Started");
    }
    public void stop() { System.out.println("Stopped");}
    public static void main(String[] args) {
        Engine eng = new Engine(-1);
        eng.start();
    }
}
