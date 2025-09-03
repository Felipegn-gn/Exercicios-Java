import java.util.ArrayList;
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
                .collect(Collectors.toMap(Usuario::getId, Usuario::getNome));
    }
}

public class EX08 {
    public static void main(String[] args) {

        List<Usuario> listaDeUsuarios = new ArrayList<>();
        listaDeUsuarios.add(new Usuario(1, "Ana"));
        listaDeUsuarios.add(new Usuario(2, "Breno"));
        listaDeUsuarios.add(new Usuario(3, "Carlos"));

        // Chama o método estático para converter a lista em um mapa.
        Map<Integer, String> mapaDeUsuarios = Usuario.converterListaParaMapa(listaDeUsuarios);

        // Imprime o mapa resultante no console.
        System.out.println(mapaDeUsuarios);
    }
}
