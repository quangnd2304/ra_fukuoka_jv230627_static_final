package ra.static_final;

public class Viewer {
    public static void main(String[] args) {
        //Người dùng 1 truy cập vào Web
        Counter counter1 = new Counter();
        counter1.countView();
        //Biến static là biến của lớp, dữ liệu dùng chung của các đối tượng
        //Truy cập thông qua lớp
        //Counter.count=10;
        //Người dùng 2 truy cập vào web
        Counter counter2 = new Counter();
        counter2.countView();
        //Người dùng 3 truy cập vào web
        Counter counter3 = new Counter();
        counter3.countView();
    }
}
