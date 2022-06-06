public class Main {

    public static void main(String[] args) throws InterruptedException {
        ResourcesExploiter resourcesExploiter = new ResourcesExploiter(0);
        ResourcesExploiterWithLock resourcesExploiterWithLock = new ResourcesExploiterWithLock(0);
//        ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resourcesExploiter);
//        ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resourcesExploiter);
//        ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resourcesExploiter);

//        ThreadedWorkerWithSync worker1 = new ThreadedWorkerWithSync(resourcesExploiter);
//        ThreadedWorkerWithSync worker2 = new ThreadedWorkerWithSync(resourcesExploiter);
//        ThreadedWorkerWithSync worker3 = new ThreadedWorkerWithSync(resourcesExploiter);

        ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resourcesExploiterWithLock);
        ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resourcesExploiterWithLock);
        ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resourcesExploiterWithLock);

        worker1.start();
        worker2.start();
        worker3.start();

        worker1.join();
        worker2.join();
        worker3.join();

        System.out.println(resourcesExploiterWithLock.getRsc());
    }
}
