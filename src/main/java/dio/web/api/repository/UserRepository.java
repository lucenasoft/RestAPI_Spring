package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositorio");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Patricio","teste"));
        usuarios.add(new Usuario("Fernanda","teste"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id"));
        return new Usuario("Patricio","teste");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username"));
        return new Usuario("Patricio","teste");
    }
}
