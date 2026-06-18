import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void Homens() {

        App app = new App();

        List<String> pessoas = List.of(
                "Luciano-M",
                "Fernanda-F",
                "Lucas-M",
                "Maria-F"
        );

        List<String> homens = app.separarHomens(pessoas);

        assertEquals(
                List.of("Luciano-M", "Lucas-M"),
                homens
        );
    }

    @Test
    void Mulheres() {

        App app = new App();

        List<String> pessoas = List.of(
                "Luciano-M",
                "Fernanda-F",
                "Lucas-M",
                "Maria-F"
        );

        List<String> mulheres = app.separarMulheres(pessoas);

        assertEquals(
                List.of("Fernanda-F", "Maria-F"),
                mulheres
        );
    }
}