package udb.gl.moneytransfer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import udb.gl.moneytransfer.domain.Operation;
import udb.gl.moneytransfer.repositories.OperationRepository;

@Controller
@RequestMapping("/api/operation")
public class OperationController {

    @Autowired
    private OperationRepository operationRepository;

    @PostMapping("/envoi")
    public Operation add(@RequestBody Operation operation){
        try {
            operationRepository.save(operation);

        }catch (Exception e){
            e.printStackTrace();
        }
        return  operation;
    }
}