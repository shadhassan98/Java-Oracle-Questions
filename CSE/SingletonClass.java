package CSE;
public final class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return instance;
    }
}
