import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        System.out.println("SORTING AND SEARCHING ANALYSIS\n");

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("SIZE: " + size);

            int[] randomArray = sorter.generateRandomArray(size);
            int[] arr1 = Arrays.copyOf(randomArray, size);
            int[] arr2 = Arrays.copyOf(randomArray, size);

            long basicTime = experiment.measureSortTime(arr1, "basic");
            long advancedTime = experiment.measureSortTime(arr2, "advanced");

            sorter.advancedSort(arr2);
            int target = arr2[size / 2];
            long searchTime = experiment.measureSearchTime(arr2, target);

            System.out.println("Random Array Results:");
            System.out.println("Basic Sort: " + basicTime);
            System.out.println("Advanced Sort: " + advancedTime);
            System.out.println("Binary Search: " + searchTime);

            int[] sortedArray = Arrays.copyOf(randomArray, size);
            sorter.advancedSort(sortedArray);

            int[] s1 = Arrays.copyOf(sortedArray, size);
            int[] s2 = Arrays.copyOf(sortedArray, size);

            long basicSorted = experiment.measureSortTime(s1, "basic");
            long advancedSorted = experiment.measureSortTime(s2, "advanced");
            long searchSorted = experiment.measureSearchTime(sortedArray, target);

            System.out.println("\nSorted Array Results:");
            System.out.println("Basic Sort: " + basicSorted);
            System.out.println("Advanced Sort: " + advancedSorted);
            System.out.println("Binary Search: " + searchSorted);
            System.out.println();
        }
        System.out.println("FULL EXPERIMENT RUN");
        experiment.runAllExperiments();
    }
}