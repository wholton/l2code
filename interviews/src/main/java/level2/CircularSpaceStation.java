package level2;

/**
 * Find the error(s).
 */
public class CircularSpaceStation {

    private final SpaceDock[] spaceDocks;

    public static void main(String[] args) {
        CircularSpaceStation circularSpaceStation = new CircularSpaceStation(5);
        circularSpaceStation.hailSpaceShips();
    }

    public CircularSpaceStation(int size) {
        Object[] locks = new Object[size];
        for (int i = 0; i < size; i++) {
            locks[i] = new Object();
        }
        spaceDocks = new SpaceDock[size];
        for (int i = 0; i < size; i++) {
            spaceDocks[i] = new SpaceDock(i, locks[i], locks[(i + 1) % size]);
        }
    }

    public void hailSpaceShips() {
        for (SpaceDock aSpaceDock : spaceDocks) {
            new Thread(aSpaceDock).start();
        }
    }

    private static class SpaceDock implements Runnable {

        private static final int TIME_TO_RUN_MILLISECONDS = 5000;
        private final int dockNumber;
        private final Object leftLock;
        private final Object rightLock;

        public SpaceDock(int dockNumber, Object leftLock, Object rightLock) {
            this.dockNumber = dockNumber;
            this.leftLock = leftLock;
            this.rightLock = rightLock;
        }

        @Override
        public void run() {
            int shipsEntered = 0;
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < TIME_TO_RUN_MILLISECONDS) {
                System.out.println("Dock number " + dockNumber + " is hailing ships!");
                synchronized (leftLock) {
                    System.out.println("Dock number " + dockNumber + " has left lock!");
                    synchronized (rightLock) {
                        System.out.println("Dock number " + dockNumber + " has right lock!");
                    }
                    System.out.println("Dock number " + dockNumber + " released right lock!");
                }
                System.out.println("Dock number " + dockNumber + " released left lock!");
                shipsEntered++;
            }
            System.out.println("Dock number " + dockNumber + " has closed after " + shipsEntered + " ships entered!");
        }
    }
}