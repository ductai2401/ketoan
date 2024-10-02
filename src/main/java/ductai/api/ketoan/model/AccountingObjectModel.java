package ductai.api.ketoan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AccountingObject",schema = "dbo")
public class AccountingObjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountingObjectID")
    private UUID accountingObjectID;

    @Column(name = "AccountingObjectCode")
    private String accountingObjectCode;

    @Column(name = "AccountingObjectName")
    private String accountingObjectName;

    @Column(name = "AccountingObjectCategoryID")
    private UUID accountingObjectCategoryID;

    @Column(name = "AccountingObjectKindID")
    private UUID accountingObjectKindID;

    @Column(name = "Address")
    private String address;

    @Column(name = "Tel")
    private String tel;

    @Column(name = "Fax")
    private String fax;

    @Column(name = "BankAccount")
    private String bankAccount;

    @Column(name = "BankName")
    private String bankName;

    @Column(name = "TaxCode")
    private String taxCode;

    @Column(name = "Email")
    private String email;

    @Column(name = "DiscountRate")
    private BigDecimal discountRate;

    @Column(name = "MaximizeDebtAmount")
    private BigDecimal maximizeDebtAmount;

    @Column(name = "DueTime")
    private int dueTime;

    @Column(name = "ContactName")
    private String contactName;

    @Column(name = "BirthdayDate")
    private LocalDate birthdayDate;

    @Column(name = "ContactTitle")
    private String contactTitle;

    @Column(name = "ContactSex")
    private String contactSex;

    @Column(name = "ContactEmail")
    private String contactEmail;

    @Column(name = "ContactOfficeTel")
    private String contactOfficeTel;

    @Column(name = "ContactHomeTel")
    private String contactHomeTel;

    @Column(name = "ContactMobile")
    private String contactMobile;

    @Column(name = "ContactAddress")
    private String contactAddress;

    @Column(name = "IdentificationNumber")
    private String identificationNumber;

    @Column(name = "IssueDate")
    private LocalDate issueDate;

    @Column(name = "IssueBy")
    private String issueBy;

    @Column(name = "FamilyDeductionAmount")
    private BigDecimal familyDeductionAmount;

    @Column(name = "SalaryScale")
    private BigDecimal salaryScale;

    @Column(name = "AccountingObjectType")
    private Integer accountingObjectType;

    @Column(name = "IsEmployee")
    private Boolean isEmployee;

    @Column(name = "DepartmentID")
    private UUID departmentID;

    @Column(name = "InActive")
    private Boolean inActive;

    @Column(name = "Description")
    private String description;

    @Column(name = "BranchID")
    private UUID branchID;

    @Column(name = "ColumnQuantity1")
    private BigDecimal columnQuantity1;

    @Column(name = "ColumnQuantity2")
    private BigDecimal columnQuantity2;

    @Column(name = "ColumnQuantity3")
    private BigDecimal columnQuantity3;

    @Column(name = "ColumnAmount1")
    private BigDecimal columnAmount1;

    @Column(name = "ColumnAmount2")
    private BigDecimal columnAmount2;

    @Column(name = "ColumnText1")
    private String columnText1;

    @Column(name = "ColumnText2")
    private String columnText2;

    @Column(name = "ColumnText3")
    private String columnText3;

    @Column(name = "ColumnText4")
    private String columnText4;

    @Column(name = "Select1")
    private Boolean select1;

    @Column(name = "Select2")
    private Boolean select2;

    @Column(name = "ModifiedBy")
    private String modifiedBy;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "Synchonized")
    private Boolean synchronizedData;

    @Column(name = "JoinDate")
    private LocalDate joinDate;

    @Column(name = "Distance")
    private BigDecimal distance;

    @Column(name = "EmployeeID")
    private UUID employeeID;

}
