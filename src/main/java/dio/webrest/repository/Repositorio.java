package dio.webrest.repository;

import dio.webrest.exceptionhandler.TipoException;
import dio.webrest.modelo.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

@Repository
public class Repositorio{


    public void save(Usuario usuario){
        if(usuario.getNome() == null || usuario.getSenha() == null) {
            throw new TipoException();
        }else{
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
            System.out.println(usuario);
        }
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Vilson","5678"));
        usuarios.add(new Usuario("Linda","1234"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
}
