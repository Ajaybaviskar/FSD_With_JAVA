public class AbstractDemo {
    public static void main(String args[]) {
        GraphicObject circle = new Circle();
        // ^ Abstract Class ^ concrete Class
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }

}
