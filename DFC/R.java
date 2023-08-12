package DFC;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class R implements Runnable {
    public void run() { System.out.println("Run..."); }
}

class C implements Callable<String> {
    public String call() throws Exception { return "Call..."; }
}

class Mainrunner2 {

    public static void main(String[] args) {
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        es2.execute(new R());  // line n1
        try {
            Future<String> f12 = es2.submit (new C()); // line n2
            System.out.println(f12.get());
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        es2.shutdown();
    }
    
}


