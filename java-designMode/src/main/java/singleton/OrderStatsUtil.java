package singleton;

/**
 * 单例模式
 */
public class OrderStatsUtil {
    private static volatile OrderStatsUtil instance;

    public static OrderStatsUtil getInstance() {
        if (instance == null) {
            synchronized (OrderStatsUtil.class) {
                if (instance == null) {
                    instance = new OrderStatsUtil();
                }
            }
        }

        return instance;
    }
    //构造方法私有化
    private OrderStatsUtil() {
    }
}
