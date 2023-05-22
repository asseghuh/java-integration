package thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * Created by shengR on 2023/2/22
 * @desc: todo
 */
public class CompletableFutureDemo1 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync( () -> CompletableFutureDemo1.getPrice())
                .thenAccept( result -> System.out.println("price:" + result) )
                .exceptionally(new Function<Throwable, Void>() {
                    @Override
                    public Void apply(Throwable e) {
                        System.out.println(e);
                        return null;
                    }
                });


    }

    static Double getPrice(){
        return Math.random() * 10;
    }
}
