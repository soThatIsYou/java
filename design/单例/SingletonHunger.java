public class SingletonHungerHunger {
    private static SingletonHunger instance = new SingletonHunger();

    private SingletonHunger() {
    }

    public static SingletonHunger newInstance() {
        return instance;
    }
}