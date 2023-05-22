package thread;

/**
 * Created by shengR on 2023/2/22
 * @desc: todo
 */
public class BuyTicket implements Runnable{
    private int tickets=10;

    public BuyTicket(){
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(tickets>0){
                System.out.println("买了一张票"+"，剩于票数："+ tickets--);
            }
        }
    }

    public static void main(String[] args) {
        BuyTicket t = new BuyTicket();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t2.start();


    }
}
