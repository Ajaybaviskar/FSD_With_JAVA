public abstract class GraphicObject {
    int x, y;

    GraphicObject() {
        System.out.println("This is Base Abstract Class");
    }

    void moveTo(int newX, int newY) {
        System.out.println("Move to x : " + x + "and y : " + y);
    }

    abstract void draw();

    abstract void resize();
}
