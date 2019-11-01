package co.edu.uco.subarberiaonline.controller;

import co.edu.uco.subarberiaonline.entity.BarberiaEntity;
import co.edu.uco.subarberiaonline.model.Barberia;
import co.edu.uco.subarberiaonline.service.barberia.BabeberiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barberias")
public class BaberiaController {

    @Autowired
    private BabeberiaService barberiaService;

    @GetMapping("/{id}/barberia")
    public Barberia findById(@PathVariable(value = "id", required = true) Long id){
        return barberiaService.findById(id);
    }

    @GetMapping("/{nit}/barberia")
    public Barberia findByNit(@PathVariable(value = "nit", required = true) String nit){
        return barberiaService.findByNit(nit);
    }

    @GetMapping("/barberias")
    public List<Barberia> findAll(){
        return barberiaService.findAll();
    }

    @DeleteMapping("{id}/barberia")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        barberiaService.deleteById(id);
    }

    @PostMapping("/barberia")
    public void insert(@RequestBody Barberia barberia){
        barberiaService.save(barberia);
    }

    @PutMapping("/{id}/barberia")
    public void update(@RequestBody BarberiaEntity barberiaEntity, @PathVariable(value = "id",required = true) Long id){
        barberiaEntity.setId(id);
        barberiaService.save(barberiaEntity);
    }

}
