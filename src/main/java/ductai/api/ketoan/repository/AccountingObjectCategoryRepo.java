package ductai.api.ketoan.repository;

import ductai.api.ketoan.model.AccountingObjectCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AccountingObjectCategoryRepo extends JpaRepository<AccountingObjectCategory, UUID> {
    @Query(value = "SELECT AccountingObjectCategoryID, "
            + "AccountingObjectCategoryName, "
            + "Description, "
            + "ASUCodeID.ToString() AS ASUCodeID, "  // Sử dụng ToString() để chuyển đổi thành chuỗi
            + "InActive, "
            + "ParentID "
            + "FROM AccountingObjectCategory",
            nativeQuery = true)  // Đánh dấu là truy vấn SQL native
    List<AccountingObjectCategory> findAllWithAsuCodeIDAsString();
}
