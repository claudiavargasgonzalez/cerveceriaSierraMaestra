package com.crud.cerveceria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.cerveceria.model.Cerveza;

@Repository
public interface CervezaRepository extends JpaRepository<Cerveza,Long>{

}
