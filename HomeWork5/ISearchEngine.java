package HomeWork5;

public interface ISearchEngine {
    public static long search(String text, String word){

        String[] arr = text.split("\\p{Space}");
        long endValue = 0;

        for (int i = 0;i<arr.length; i++) {
            long value = 0;
            if (arr[i].equals(word)) {
                value++;
            }
            endValue = value;
        }
        return endValue;
    }

}
