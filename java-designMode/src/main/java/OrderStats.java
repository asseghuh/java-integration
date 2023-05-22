/**
 * builder模式设计案例
 */
public class OrderStats {

    private String passengerId;

    //默认值为0
    private Long orderCancelCnt;

    private Long less2KMMileageCnt;

    private Long ts;

    public String getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }
    public Long getOrderCancelCnt() {
        return orderCancelCnt;
    }
    public void setOrderCancelCnt(Long orderCancelCnt) {
        this.orderCancelCnt = orderCancelCnt;
    }
    public Long getLess2KMMileageCnt() {
        return less2KMMileageCnt;
    }
    public void setLess2KMMileageCnt(Long less2KMMileageCnt) {
        this.less2KMMileageCnt = less2KMMileageCnt;
    }
    public Long getTs() {
        return ts;
    }
    public void setTs(Long ts) {
        this.ts = ts;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public OrderStats() {
    }

    public OrderStats(Builder builder) {
        this.orderCancelCnt = builder.orderCancelCnt;
    }

    public static final class Builder {

        private Long orderCancelCnt;

        public Builder() {
            this.orderCancelCnt = 0L;
        }

        public Long getOrderCancelCnt() {
            return orderCancelCnt;
        }
        public void setOrderCancelCnt(Long orderCancelCnt) {
            this.orderCancelCnt = orderCancelCnt;
        }

        public OrderStats build() {
            return new OrderStats(this);
        }
    }

    public static void main(String[] args) {
        new OrderStats.Builder().build();
    }
}
