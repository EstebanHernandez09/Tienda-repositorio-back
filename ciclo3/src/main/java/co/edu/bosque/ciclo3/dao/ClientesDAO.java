package co.edu.bosque.ciclo3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.bosque.ciclo3.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Long> {
	
}
