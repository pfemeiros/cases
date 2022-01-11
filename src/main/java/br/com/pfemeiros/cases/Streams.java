package br.com.pfemeiros.cases;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class Streams {

    public Long getTotalOfElements(Stream<String> stream) {
        return 0L;
    }

    public Stream<String> getFirstTwoElements(Stream<String> stream) {
        return Stream.empty();
    }

    public Stream<String> removeFirstTwoElements(Stream<String> stream) {
        return Stream.empty();
    }

    public Stream<String> orderStream(Stream<String> stream) {
        return Stream.empty();
    }

    public Stream<String> filterNamesBySize(Stream<String> stream) {
        return Stream.empty();
    }

    public Stream<String> getNamesUppercase(Stream<String> stream) {
        return Stream.empty();
    }

    public Long sumAllValuesOfStream(Stream<Long> stream) {
        return 0L;
    }


    public Long getAverageOfValuesOfStream(Stream<Long> stream) {
        return 0L;
    }

}
