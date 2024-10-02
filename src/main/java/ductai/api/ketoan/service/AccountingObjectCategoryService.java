package ductai.api.ketoan.service;

import ductai.api.ketoan.dto.response.AccountingObjectCategoryResponseDTO;
import ductai.api.ketoan.model.AccountingObjectCategory;

import java.util.List;

public interface AccountingObjectCategoryService {
    List<AccountingObjectCategoryResponseDTO> getAllAccountingObjectCategory();
    List<AccountingObjectCategory> findAll();

}
