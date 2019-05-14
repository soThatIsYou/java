
public class SingletonStatic {
    private static class SingletonStaticHolder {
        public static SingletonStatic instance = new SingletonStatic();
    }

    private SingletonStatic() {
    }

    public static SingletonStatic newInstance() {
        return SingletonStaticHolder.instance;
    }
}
