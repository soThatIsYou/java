public class SigletonLazy {
    private static SigletonLazy instance = null;

    private SigletonLazy() {
    }

    public static SigletonLazy newInstance() {
        if (null == instance) {
            instance = new SigletonLazy();
        }
        return instance;
    }
}
