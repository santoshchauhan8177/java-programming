class ArrayHandler{
    public void accessArray(int[] numbers){
        try {
            System.out.println(numbers[51]);
        } catch (Exception e) {
            System.out.println("Array Index Out of Bound");
        }
        catch(Exception e) {
            System.out.println("An unexpected error occurred");
    
    }
}
}
public class MultiException {
    
public static void main(String[] args) {
        ArrayHandler ah = new ArrayHandler();
        int[] numbers = {1, 2, 3, 4, 5};
        ah.accessArray(numbers);
    }
}
