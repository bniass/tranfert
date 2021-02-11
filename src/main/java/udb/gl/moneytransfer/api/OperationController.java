package udb.gl.moneytransfer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import udb.gl.moneytransfer.domain.Client;
import udb.gl.moneytransfer.domain.Operation;
import udb.gl.moneytransfer.domain.User;
import udb.gl.moneytransfer.repositories.ClientRepository;
import udb.gl.moneytransfer.repositories.OperationRepository;
import udb.gl.moneytransfer.repositories.UserRepository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/api/operation")
public class OperationController {

    @Autowired
    private OperationRepository operationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/envoi")
    public ResponseEntity<?> add(@RequestBody Operation operation){
        try {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dateenvoi = sd.format(new Date());
            operation.setDateEnvoi(sd.parse(dateenvoi));

            Client envoyeur = clientRepository.findByTel(operation.getEnvoyeur().getTel());
            if(envoyeur != null){
                operation.setEnvoyeur(envoyeur);
            }
            Client dest = clientRepository.findByTel(operation.getDestinataire().getTel());
            if(dest != null){
                operation.setDestinataire(dest);
            }

            User user = userRepository.findByEmail(operation.getUserEnvoyeur().getEmail()).get();
            operation.setUserEnvoyeur(user);

            operationRepository.save(operation);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(operation);
    }

    @GetMapping("/expediteur/{tel}")
    public ResponseEntity<?> findClientByTel(@PathVariable("tel") String tel){
        return ResponseEntity.ok(clientRepository.findByTel(tel));
    }
}
