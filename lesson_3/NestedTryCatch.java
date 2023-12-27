public class NestedTryCatch {
    public static void main(String args[]) {
        try {
            // block 1
            try {
                // block 2
                try {
                    // block 3
                    int arr[] = { 1, 2, 3, 4, 5 };
                    System.out.println(arr[10]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException Exception in block 3");
                    throw e;
                }
            } catch (Exception e) {
                System.out.println("ArrayIndexOutOfBoundsException Exception in Block 2");
                throw e;
            }
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException Exception in Block 1");

        }
    }
}
