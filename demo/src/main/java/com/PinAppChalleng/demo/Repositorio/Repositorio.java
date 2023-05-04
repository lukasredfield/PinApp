package com.PinAppChalleng.demo.Repositorio;

import com.PinAppChalleng.demo.Clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Cliente,Long> {
}
