public class ThreadedWorkerWithLock extends Thread {
    private ResourcesExploiterWithLock rExp;

    ThreadedWorkerWithLock(ResourcesExploiterWithLock resourcesExploiterWithLock) {
        this.rExp = resourcesExploiterWithLock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            rExp.exploit();
        }
    }
}
