package udb.gl.moneytransfer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.gl.moneytransfer.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByNumpiece(String numpiece);
    Client findByTel(String tel);
}
