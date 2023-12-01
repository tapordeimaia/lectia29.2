import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Stream.of("1", "2", "3")
//                .filter(s -> s.equals("A"))
                .map(s -> new Integer(s))
                .reduce(0, (a, b) -> a+b);
        System.out.println(sum);

        Stream.of("A", "B", "C")
//                .filter(s -> s.equals("A"))
                .map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));
//
//        Predicate2<String> predicate2 = (String s) -> s.equals("A");
//        Predicate2
//        FilterService filterService = new FilterService();
//        List<String> filteredList = filterService.filter(Arrays.asList("A", "B", "C"), s ->s.equals("B"));
//        System.out.println(filteredList);

//        Service service = new Service();
//        service.afisare(Arrays.asList("A", "B", "C"), s -> System.out.println(s));

//        Service service = new Service();
//        List<String> list = service.modify(Arrays.asList("A", "B", "C"), s-> s.toLowerCase());
//        System.out.println(list);

//        service.addValue(Arrays.asList("A", "B", "C"), () -> "x");
    }
}