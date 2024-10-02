package ductai.api.ketoan.repository;

import ductai.api.ketoan.model.AccountingObjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AccountingObjectRepo extends JpaRepository<AccountingObjectModel, UUID> {

}
