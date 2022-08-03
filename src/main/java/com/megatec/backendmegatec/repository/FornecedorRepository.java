package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
