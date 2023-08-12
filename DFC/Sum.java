package DFC;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

class Sum extends RecursiveAction { 
    //line n1 
    static final int THRESHOLD_SIZE = 3; 
    int stIndex, lstIndex; 
    int[] data; 
    public Sum (int[] data, int start, int end) { 
        this.data = data; 
        this.stIndex = start; this. lstIndex = end;
    }
    protected void compute ( ) {
        int sum = 0;
        if (lstIndex - stIndex <= THRESHOLD_SIZE) {
            for (int i = stIndex; i < lstIndex; i++) {
                sum += data [i];
            }
            System.out.println(sum);
        } 
        else {
            new Sum (data, stIndex + THRESHOLD_SIZE, lstIndex).fork( );
            new Sum (data, stIndex , Math.min (lstIndex, stIndex + THRESHOLD_SIZE)).compute ();
            // ForkJoinTask<Void> task1 = new Sum (data, stIndex + THRESHOLD_SIZE, lstIndex).fork( );
            // ForkJoinTask<Void> task2 = new Sum (data, stIndex , Math.min (lstIndex, stIndex + THRESHOLD_SIZE)).fork();
            // wait for the completion of the forked tasks
            // task2.join();
            // task1.join();
        }
    }
        public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool();
        int data2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Sum task = new Sum (data2, 0, data2.length);
        fjPool.invoke(task);
    } 
}