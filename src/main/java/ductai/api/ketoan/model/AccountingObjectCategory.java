package ductai.api.ketoan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "AccountingObjectCategory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountingObjectCategory {

    @Id
    @Column(name = "AccountingObjectCategoryID", columnDefinition = "uniqueidentifier")
    private UUID accountingObjectCategoryID;

    @Column(name = "AccountingObjectCategoryName")
    private String accountingObjectCategoryName;

    @Column(name = "Description")
    private String description;

    @Column(name = "ASUCodeID", columnDefinition = "uniqueidentifier")
    private String asuCodeID;

    @Column(name = "InActive")
    private Boolean inActive =true;

    @Column(name = "ParentID", columnDefinition = "uniqueidentifier")
    private UUID parentID;

    // Hàm này tự động sinh UUID trước khi lưu vào database
    @PrePersist
    public void prePersist() {
        if (accountingObjectCategoryID == null) {
            accountingObjectCategoryID = UUID.randomUUID();
        } else if (parentID == null) {
            parentID = UUID.randomUUID();
        }
    }
}
