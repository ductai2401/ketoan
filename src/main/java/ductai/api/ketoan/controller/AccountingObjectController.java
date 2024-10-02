package ductai.api.ketoan.controller;

import ductai.api.ketoan.dto.response.AccountingObjectResponseDTO;
import ductai.api.ketoan.model.AccountingObjectModel;
import ductai.api.ketoan.service.AccountingObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounting-objects")
public class AccountingObjectController {

    @Autowired
    private AccountingObjectService service;

//    @GetMapping
//    public ResponseEntity<List<AccountingObjectResponseDTO>>getaAllAccountingObject(){
//        List<AccountingObjectResponseDTO> response = service.getAllAccountingObject();
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

    @GetMapping
    public List<AccountingObjectModel> findAllAccountingObjects() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountingObjectModel> getAccountingObjectById(@PathVariable UUID id) {
        Optional<AccountingObjectModel> accountingObject = service.findById(id);
        return accountingObject.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountingObjectModel> createAccountingObject(@RequestBody AccountingObjectModel accountingObject) {
        AccountingObjectModel savedObject = service.save(accountingObject);
        return ResponseEntity.created(URI.create("/api/accounting-objects/" + savedObject.getAccountingObjectID())).body(savedObject);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountingObjectModel> updateAccountingObject(@PathVariable UUID id, @RequestBody AccountingObjectModel accountingObject) {
        accountingObject.setAccountingObjectID(id);
        AccountingObjectModel updatedObject = service.save(accountingObject);
        return ResponseEntity.ok(updatedObject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccountingObject(@PathVariable UUID id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
