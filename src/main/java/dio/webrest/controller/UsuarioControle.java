package dio.webrest.controller;


import dio.webrest.modelo.Usuario;
import dio.webrest.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioControle {

    @Autowired
    private Repositorio repositorio;

    @GetMapping("/users")
    public List<Usuario> getUsuario(){
        return repositorio.listAll();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUsuario(@PathVariable Integer id){
        repositorio.finById(id);
    }

    @PostMapping("Users")
    public void postUsuario(@RequestBody Usuario usuario){
        repositorio.save(usuario);
    }
}
