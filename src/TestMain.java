public class TestMain {
    public static void main(String[] args) {
        int[] arr1 = {3,6,9};
        int[] arr2 = arr1;
        arr2[2] = arr1[1];
        System.out.println(arr1[2]);
    }
}
