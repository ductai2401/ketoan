package ductai.api.ketoan.service.impl;

import ductai.api.ketoan.dto.response.AccountingObjectCategoryResponseDTO;
import ductai.api.ketoan.model.AccountingObjectCategory;
import ductai.api.ketoan.repository.AccountingObjectCategoryRepo;
import ductai.api.ketoan.repository.AccountingObjectRepo;
import ductai.api.ketoan.service.AccountingObjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountingObjectCategoryServiceImpl implements AccountingObjectCategoryService {

    @Autowired
    AccountingObjectCategoryRepo repository;
    @Override
    public List<AccountingObjectCategoryResponseDTO> getAllAccountingObjectCategory() {
        List<AccountingObjectCategory> accountingObjectCategories = repository.findAllWithAsuCodeIDAsString();

         return accountingObjectCategories.stream()
                .map(category -> new AccountingObjectCategoryResponseDTO(
                        category.getAccountingObjectCategoryID(),
                        category.getAccountingObjectCategoryName(),
                        category.getInActive(),
                        category.getAsuCodeID(),
                        category.getParentID()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public List<AccountingObjectCategory> findAll() {
        return repository.findAll();
    }
}
