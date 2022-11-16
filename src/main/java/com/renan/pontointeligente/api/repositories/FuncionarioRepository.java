package com.renan.pontointeligente.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.renan.pontointeligente.api.entities.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	Optional<Funcionario> findById(Long id);
	
	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
}
