package co.edu.bosque.ciclo3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.bosque.ciclo3.model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, Long> {

}
