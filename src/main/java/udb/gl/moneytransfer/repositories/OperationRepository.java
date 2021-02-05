package udb.gl.moneytransfer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udb.gl.moneytransfer.domain.Operation;

import java.util.Optional;


@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

}
