import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){

        List<String> pessoas = new ArrayList<>();

        pessoas.add("Luciano-M");
        pessoas.add("Fernanda-F");
        pessoas.add("Lucas-M");
        pessoas.add("Maria-F");
        System.out.println(pessoas);

 //      Separamos por List de Homens e Mulheres

        List<String> homens = pessoas.stream()
                .filter(p -> p.endsWith("M"))
                .toList();
        System.out.println("Homens:" + homens);

        List<String> mulheres = pessoas.stream()
                .filter(p -> p.endsWith("F"))
                .toList();
        System.out.println("Mulheres:" + mulheres);



    }




}
