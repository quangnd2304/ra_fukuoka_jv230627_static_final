package ra.static_final;

public class Counter {
    //Ứng dụng web, đếm số lượt truy cập của khách hàng vào ứng dụng web
    //để phục công tác marketing
    private static int count;
    private static int a;
    private int b;
    static{
        count=0;
        a=10;
    }

    public Counter() {
    }

    public void countView(){
        count++;
        printCount();
    }

    public void printCount(){
        System.out.println("Số lượt truy cập: "+this.count);
    }
}
