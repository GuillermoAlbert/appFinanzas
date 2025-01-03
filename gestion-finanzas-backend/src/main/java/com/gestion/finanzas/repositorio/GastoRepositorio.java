package com.gestion.finanzas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.finanzas.modelo.Gasto;

@Repository
public interface GastoRepositorio extends JpaRepository<Gasto, Long>{

}
