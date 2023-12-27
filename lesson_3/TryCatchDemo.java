import java.util.ArrayList;
import java.util.List;

class WriterHelper {
    public void WriteList() {
        try {
            List<Integer> list = new ArrayList<>(10);
            list.add(10);
            System.out.println("Entering Try Statement");
            Integer a = list.get(0);
            System.out.println("Accessing The First element : " + a);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught Index Out of Bounds Exception : " + e.getMessage());
            // TODO: handle exception
        } finally {
            System.out.println("This will Always Be Executed ");
        }
    }
}

public class TryCatchDemo {
    public static void main(String args[]) {
        WriterHelper wh = new WriterHelper();
        wh.WriteList();

    }

}
