import java.util.List;

public class App {

    public List<String> separarHomens(List<String> pessoas) {
        return pessoas.stream()
                .filter(p -> p.endsWith("M"))
                .toList();
    }

    public List<String> separarMulheres(List<String> pessoas) {
        return pessoas.stream()
                .filter(p -> p.endsWith("F"))
                .toList();
    }

    public static void main(String[] args) {

        List<String> pessoas = List.of(
                "Luciano-M",
                "Fernanda-F",
                "Lucas-M",
                "Maria-F"
        );

        App app = new App();

        List<String> homens = app.separarHomens(pessoas);
        List<String> mulheres = app.separarMulheres(pessoas);

        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);
    }
}