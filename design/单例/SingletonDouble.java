public class SingletonDouble {
    private static SingletonDouble instance = null;

    private SingletonDouble() {
    }

    public static SingletonDouble getInstance() {
        if (instance == null) {
            synchronized (SingletonDouble.class) {
                if (instance == null) {
                    instance = new SingletonDouble();
                }
            }
        }
        return instance;
    }
}
