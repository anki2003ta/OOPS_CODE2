/*Your program will have two threads - the main thread and a thread that you create. The thread that you create will be responsible for calculating max value in an array of 5 integers.
a) Create thread for the above program by extending the thread class.
*/
// Extend Thread class
class MaxFinderThread extends Thread {
    private int[] array;

    public MaxFinderThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {10, 25, 31, 12, 22};

        // Create MaxFinderThread
        MaxFinderThread thread = new MaxFinderThread(array);

        // Start the thread
        thread.start();

        // Main thread prints array elements
        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Wait for the thread to finish
        thread.join();

        // Main thread executes last
        System.out.println("\nMain thread execution completed.");
    }
}
