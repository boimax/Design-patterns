/*
NOTE: 
Circle: child of Shape 
RedCircle: child of DrawAPI
Shape HAS-A DrawAPI -> new Circle(new RedCircle()): wrapped

Vì thằng abstract sở hữu toàn bộ implement (Trong constructor), mà implement được thừa kế bởi hết tất cả các 
thằng con. Nên thằng abstract có thể access vô bất kỳ thằng con nào của implement.
*/
public class Client {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new RedCircle());
        circle1.draw();// this draw() will call to drawCircle() of RedCircle class. Access vào thằng
                       // con thì phải gọi method của thằng con.

        Shape circle2 = new Circle(new GreenCircle());
        circle2.draw();
    }
}
