import java.util.List;
import java.util.ArrayList;

public class Counter {
    public static class Result {
        private List<Integer> elements;
        private List<Integer> frequencies;

        public Result(List<Integer> elements, List<Integer> frequencies) {
            this.elements = elements;
            this.frequencies = frequencies;
        }

        public List<Integer> getElements() {
            return elements;
        }

        public List<Integer> getFrequencies() {
            return frequencies;
        }
    }

    public static Result countDuplic(List<Integer> lists) {
        List<Integer> elements = new ArrayList<>();
        List<Integer> frequencies = new ArrayList<>();
        if (lists == null || lists.isEmpty()) {
            return new Result(elements, frequencies);
        }
        int runningCount = 1;
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).equals(lists.get(i + 1))) {
                runningCount++;
            } else {
                frequencies.add(runningCount);
                elements.add(lists.get(i));
                runningCount = 1;
            }
        }
        frequencies.add(runningCount);
        elements.add(lists.get(lists.size() - 1));
        return new Result(elements, frequencies);
    }
}
