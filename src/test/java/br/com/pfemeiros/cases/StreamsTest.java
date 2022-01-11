package br.com.pfemeiros.cases;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class StreamsTest {

    @InjectMocks
    private Streams streams;

    @Test
    void getTotalOfElements_shouldReturnTwo() {
        Long totalOfElements = streams.getTotalOfElements(Stream.of("A", "B"));
        assertEquals(2L, totalOfElements);
    }

    @Test
    void getFirstTwoElements_shouldValidate() {
        Stream<String> twoElements = streams.getFirstTwoElements(Stream.of("A", "B", "C"));
        assertEquals("A", twoElements.collect(Collectors.toList()).get(0));
        assertEquals("B", twoElements.collect(Collectors.toList()).get(1));
    }

    @Test
    void removeFirstTwoElements_shouldValidate() {
        Stream<String> stringStream = streams.removeFirstTwoElements(Stream.of("A", "B", "C", "D"));
        assertEquals("C", stringStream.collect(Collectors.toList()).get(0));
        assertEquals("D", stringStream.collect(Collectors.toList()).get(1));
    }


    @Test
    void orderStreamLex_shouldValidate() {
        Stream<String> stringStream = streams.orderStream(Stream.of("D", "B", "A", "C"));
        assertEquals("A", stringStream.collect(Collectors.toList()).get(0));
        assertEquals("B", stringStream.collect(Collectors.toList()).get(1));
        assertEquals("C", stringStream.collect(Collectors.toList()).get(2));
        assertEquals("D", stringStream.collect(Collectors.toList()).get(3));
    }

    @Test
    void filterNameBySize_shouldReturnOnlyLessThanFive() {
        Stream<String> names = streams.filterNamesBySize(Stream.of("José", "Maria", "Juliana", "Carlos", "Ana"));
        assertEquals(2L, names.count());
    }

    @Test
    void transformToUppercase_shouldValidate() {
        Stream<String> names = streams.getNamesUppercase(Stream.of("josé", "maria", "juliana"));
        assertEquals("José", names.collect(Collectors.toList()).get(0));
        assertEquals("Maria", names.collect(Collectors.toList()).get(1));
        assertEquals("Juliana", names.collect(Collectors.toList()).get(2));
    }

    @Test
    void sumStream_shouldValidate() {
        Long sum = streams.sumAllValuesOfStream(Stream.of(10L, 20L, 30L));
        assertEquals(60L, sum);
    }

    @Test
    void averageOfStream_shouldValidate() {
        Long average = streams.getAverageOfValuesOfStream(Stream.of(10L, 20L, 30L));
        assertEquals(20L, average);
    }
}
