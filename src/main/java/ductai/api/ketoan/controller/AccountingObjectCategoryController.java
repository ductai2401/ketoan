package ductai.api.ketoan.controller;

import ductai.api.ketoan.dto.response.AccountingObjectCategoryResponseDTO;
import ductai.api.ketoan.model.AccountingObjectCategory;
import ductai.api.ketoan.service.AccountingObjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/accounting-object-categories")
public class AccountingObjectCategoryController {

    @Autowired
    private AccountingObjectCategoryService service;

    @GetMapping
    public ResponseEntity<List<AccountingObjectCategoryResponseDTO>> getAllCategories(){
        List<AccountingObjectCategoryResponseDTO> response = service.getAllAccountingObjectCategory();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
