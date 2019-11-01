package co.edu.uco.subarberiaonline.controller;

import co.edu.uco.subarberiaonline.entity.CitaEntity;
import co.edu.uco.subarberiaonline.model.Barberia;
import co.edu.uco.subarberiaonline.model.Cita;
import co.edu.uco.subarberiaonline.service.cita.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/{id}/cita")
    public Cita findById(@PathVariable(value = "id", required = true) Long id){
        return citaService.findById(id);
    }

    @GetMapping("/cita")
    public List<Cita> findAll(){
        return citaService.findAll();
    }

    @DeleteMapping("{id}/cita")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        citaService.deleteById(id);
    }

    @PostMapping("/cita")
    public void insert(@RequestBody Cita cita){
        citaService.save(cita);
    }

    @PutMapping("/{id}/cita")
    public void update(@RequestBody CitaEntity citaEntity, @PathVariable(value = "id",required = true) Long id){
        citaEntity.setId(id);
        citaService.save(citaEntity);
    }

    @GetMapping("/{idBarberia}/cita")
    public List<Cita> findAllByBarberia(@PathVariable(value = "id_barberia", required = true) Barberia id){
        return citaService.findAllByBarberia(id);
    }

}
