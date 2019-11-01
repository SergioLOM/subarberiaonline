package co.edu.uco.subarberiaonline.controller;

import co.edu.uco.subarberiaonline.entity.UsuarioEntity;
import co.edu.uco.subarberiaonline.model.Usuario;
import co.edu.uco.subarberiaonline.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}/usuario")
    public Usuario findById(@PathVariable(value = "id", required = true) Long id){
        return usuarioService.findById(id);
    }

    @GetMapping("/{nroDocumento}/usuariod")
    public Usuario findByNroDocumento(@PathVariable(value = "nroDocumento", required = true) String nroDocumento){
        return usuarioService.findByNroDocumento(nroDocumento);
    }

    @GetMapping("/usuarios")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @DeleteMapping("{id}/usuario")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        usuarioService.deleteById(id);
    }

    @PostMapping("/usuario")
    public void insert(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @PutMapping("/{id}/usuario")
    public void update(@RequestBody UsuarioEntity usuarioEntity, @PathVariable(value = "id",required = true) Long id){
        usuarioEntity.setId(id);
        usuarioService.save(usuarioEntity);
    }

}
