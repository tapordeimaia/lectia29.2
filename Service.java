import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Service<T> {
    public List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for(T val: list){
            if(predicate.test(val)){
                filtered.add(val);
            }
        }
        return filtered;
    }
    public void afisare(List<T> list, Consumer<T> consumer){
        for(T val: list){
            consumer.accept(val);
        }
    }
    public List<T> modify(List<T> list, Function<T, T> function){
        List<T> modifiedList = new ArrayList<>();
        for(T val: list){
            modifiedList.add(function.apply(val));
        }
        return modifiedList;
    }

//    public void addValue(List<T> list, Supplier<T> supplier){
//        for(T val: list){
//            System.out.println(val + supplier.get());
//        }
//    }
}
