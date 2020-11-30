package HomeWork5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WarAndPies {
    public static void main(String[] args) throws IOException {
                    FileReader reader = new FileReader("Война и мир_книга.txt");
            int c;
            String text;
            StringBuilder stringBuilder = new StringBuilder();
            while ((c= reader.read())!= -1) {
                stringBuilder.append((char) c);
            }
            text = stringBuilder.toString();
//        String text = "Егор Егор Алла-Александр Егор vxcv dfg =+sdf_--_ sdf 1!?2343 6547>/. я я я я я  я я я я я я";
        String[] arr = text.replaceAll("\\p{Punct}|[0-9]","").split("\\p{Space}");
        Set<String> set = new LinkedHashSet<>();
        Collections.addAll(set, arr);

        List<Integer> allValues = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();
        for (String value : arr) {
            int values = 0;
            for (String s : arr) {
                if (value.equals(s)) {
                    values++;
                }

            }
            if (!map.containsKey(value)) {
                map.put(value, values);
            }
            allValues.add(values);
        }
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>(10);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        for (int i = 10; i < map.size(); i++) {
            map.remove(map.get(i));
        }
        System.out.println(set);
        System.out.println(reverseSortedMap);




//        Pattern pattern = Pattern.compile("[а-яА-я,-]");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.print(text.substring(matcher.start(), matcher.end()));
//        }


    }
}
