package com.upiiz.formularios.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {
    @GetMapping("/mascotas")
    public String ListadoMascota(){
        return "mascotas/mascotas-listado";
    }

    @GetMapping ("/mascotas/actualizar")
    public String FormularioactualizarMascota(){
        return "mascotas/mascotas-actualizar";
    }

    @GetMapping("/mascotas/eliminar")
    public String eliminarMascota(){
        return "mascotas/mascotas-eliminar";
    }

    @GetMapping("/mascotas/agregar")
    public String mostrarGuardar(){
        return "mascotas/mascotas-agregar";
    }

    @PostMapping ("/mascotas/guardar")
    public String agregarMascota(){
        //guardamos la mascota y rediriccionamos al listado
        return "redirect:/mascotas";
    }
    @PostMapping ("/mascotas/actualizar")
    public String actualizarMascotas(){
        return "redirect:/mascotas";
    }
    @PostMapping ("/mascotas/eliminar")
    public String eliminarmascota(){
        return "redirect:/mascotas";
    }
}
