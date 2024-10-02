package ductai.api.ketoan.service;

import ductai.api.ketoan.dto.response.AccountingObjectResponseDTO;
import ductai.api.ketoan.model.AccountingObjectModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountingObjectService {

    List<AccountingObjectResponseDTO> getAllAccountingObject();

    List<AccountingObjectModel> findAll();

    Optional<AccountingObjectModel> findById(UUID id);

    AccountingObjectModel save(AccountingObjectModel accountingObject);

    void deleteById(UUID id);
}
