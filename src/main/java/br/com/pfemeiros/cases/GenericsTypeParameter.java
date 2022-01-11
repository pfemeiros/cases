package br.com.pfemeiros.cases;

import java.util.List;
import java.util.stream.Collectors;

public class GenericsTypeParameter<T, K> {

    public List<T> sort(List<T> list, List<K> list2) {
        return list.stream().sorted().collect(Collectors.toList());
    }

}
