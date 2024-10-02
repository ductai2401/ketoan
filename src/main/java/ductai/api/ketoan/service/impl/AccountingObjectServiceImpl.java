package ductai.api.ketoan.service.impl;

import ductai.api.ketoan.dto.response.AccountingObjectResponseDTO;
import ductai.api.ketoan.model.AccountingObjectModel;
import ductai.api.ketoan.repository.AccountingObjectRepo;
import ductai.api.ketoan.service.AccountingObjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AccountingObjectServiceImpl implements AccountingObjectService {

    @Autowired
    AccountingObjectRepo accountingObjectRepo;


    @Override
    public List<AccountingObjectResponseDTO> getAllAccountingObject() {
        List<AccountingObjectModel> accountingObjects = accountingObjectRepo.findAll();

        // Chuyển đổi sang DTO
        return accountingObjects.stream()
                .map(object -> new AccountingObjectResponseDTO(
                        object.getAccountingObjectID(),
                        object.getAccountingObjectName(),
                        object.getAccountingObjectCategoryID(),
                        object.getInActive(),
                        object.getAddress(),
                        object.getTel(),
                        object.getFax(),
                        object.getEmail()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public List<AccountingObjectModel> findAll() {
        return accountingObjectRepo.findAll();
    }

    @Override
    public Optional<AccountingObjectModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public AccountingObjectModel save(AccountingObjectModel accountingObject) {
        return accountingObjectRepo.save(accountingObject);
    }

    @Override
    public void deleteById(UUID id) {

    }
}
