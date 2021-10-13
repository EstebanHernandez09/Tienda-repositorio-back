package co.edu.bosque.ciclo3.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.bosque.ciclo3.dao.DetalleVentasDAO;
import co.edu.bosque.ciclo3.model.DetalleVentas;

@RestController
@RequestMapping("detalleventas")
public class DetalleVentasAPI {
	@Autowired 
	private DetalleVentasDAO detalleventasDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody DetalleVentas detalleventas) {
		detalleventasDAO.save(detalleventas);	
	}
	
	@GetMapping("/listar")
	public List<DetalleVentas> listar(){
		return detalleventasDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		detalleventasDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DetalleVentas detalleventas) {
		detalleventasDAO.save(detalleventas);
	}

}
