public class ThreadedWorkerWithSync extends Thread {
    private ResourcesExploiter rExp;

    ThreadedWorkerWithSync(ResourcesExploiter resourcesExploiter) {
        this.rExp = resourcesExploiter;
    }

    @Override
    public void run() {
        synchronized (rExp) {
            for (int i = 0; i < 1000; i++) {
                rExp.exploit();
            }
        }
    }
}
