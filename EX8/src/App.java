import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Usuario {
    private Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static Map<Integer, String> converterListaParaMapa(List<Usuario> usuarios) {
        return usuarios.stream()
                .collect(Collectors.toMap(Usuario :: getId, Usuario :: getNome));
    }
}

public class App { // A classe principal precisa ter um nome. Mudei para Main.
    public static void main(String[] args) {
        List<Usuario> listaDeUsuarios = List.of(
                new Usuario(1 ,  "Ana"),
                new Usuario(2 ,  "Breno"),
                new Usuario(3 ,  "Carlos"));

        // Chamada correta do método estático
        Map<Integer, String> mapaDeUsuarios = Usuario.converterListaParaMapa(listaDeUsuarios);

        System.out.println(mapaDeUsuarios);
    }
}