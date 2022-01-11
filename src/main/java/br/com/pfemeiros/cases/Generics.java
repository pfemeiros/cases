package br.com.pfemeiros.cases;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Generics {

    public List<?> mergeList(List<?> list1, List<?> list2) {
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }

    public List<?> mergeListSafe(List<? extends Number> list1, List<? extends Number> list2) {
        return list1.stream().sorted().collect(Collectors.toList());
    }


}
