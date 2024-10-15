package school.sptech.providers.biblioteca;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.LivroFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RemoverLivroPorTituloInvalidoProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        Object book1 = LivroFactory.build("O Senhor dos Anéis", "J. R. R. Tolkien", LocalDate.parse("1954-07-29"), new ArrayList<>());
        Object book2 = LivroFactory.build("Harry Potter e a Pedra Filosofal", "J. K. Rowling", LocalDate.parse("1997-06-26"), new ArrayList<>());
        Object book3 = LivroFactory.build("O Pequeno Príncipe", "Antoine de Saint-Exupéry", LocalDate.parse("1943-04-06"), new ArrayList<>());
        Object book4 = LivroFactory.build("Dom Quixote", "Miguel de Cervantes", LocalDate.parse("1605-01-16"), new ArrayList<>());
        Object book5 = LivroFactory.build("1984", "George Orwell", LocalDate.parse("1949-06-08"), new ArrayList<>());

        List<Object> list = List.of(book1, book2, book3, book4, book5);
        return Stream.of(
                Arguments.arguments(list, null, list),
                Arguments.arguments(list, "", list),
                Arguments.arguments(list, " ", list)
        );

    }
}