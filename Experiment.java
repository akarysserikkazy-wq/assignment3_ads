import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length); // копия массива
        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else if (type.equals("advanced")) {
            sorter.advancedSort(copy);
        }
        long end = System.nanoTime();
        return end - start;
    }
    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();
        return end - start;
    }
    public void runAllExperiments() {
        int[] sizes = {5, 10, 20};

        for (int size : sizes) {
            System.out.println("Array Size: " + size);
            int[] randomArray = sorter.generateRandomArray(size);

            long basicTime = measureSortTime(randomArray, "basic");
            long advancedTime = measureSortTime(randomArray, "advanced");

            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            sorter.advancedSort(sortedArray);

            int target = sortedArray[size / 2];
            long searchTime = measureSearchTime(sortedArray, target);

            System.out.println("Random Array:");
            System.out.println("Basic Sort Time: " + basicTime);
            System.out.println("Advanced Sort Time: " + advancedTime);
            System.out.println("Binary Search Time: " + searchTime);

            int[] alreadySorted = Arrays.copyOf(sortedArray, sortedArray.length);
            long basicSortedTime = measureSortTime(alreadySorted, "basic");
            long advancedSortedTime = measureSortTime(alreadySorted, "advanced");

            long searchSortedTime = measureSearchTime(alreadySorted, target);

            System.out.println("Sorted Array:");
            System.out.println("Basic Sort Time: " + basicSortedTime);
            System.out.println("Advanced Sort Time: " + advancedSortedTime);
            System.out.println("Binary Search Time: " + searchSortedTime);
            System.out.println();
        }
    }
}