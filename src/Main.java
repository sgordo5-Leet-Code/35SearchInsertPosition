public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array1 = {1,3,5,6};
        int[] array2 = {1};

        System.out.println(solution.searchInsert(array1, 5));
        System.out.println(solution.searchInsert(array1, 2));
        System.out.println(solution.searchInsert(array1, 7));
        System.out.println(solution.searchInsert(array1, 0));
        System.out.println(solution.searchInsert(array2, 0));
    }
}
