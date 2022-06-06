public class ThreadedWorkerWithoutSync extends Thread {
    private ResourcesExploiter rExp;

    ThreadedWorkerWithoutSync(ResourcesExploiter resourcesExploiter) {
        this.rExp = resourcesExploiter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            rExp.exploit();
        }
    }
}
