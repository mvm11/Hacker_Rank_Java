import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesNamesOfStringList {

    public static void main(String[] args) {
        List<String> duplicates = List.of("Mateo", "Mateo", "Camilo", "Sara", "Emily", "Emily", "Emily");

        Set<String> duplicatesName = duplicates.stream()
                .filter(name -> Collections.frequency(duplicates, name) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicatesName);

    }
}
