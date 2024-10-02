package ductai.api.ketoan.dto.response;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountingObjectCategoryResponseDTO implements Serializable {
    private UUID accountingObjectCategoryID; // ID
    private String accountingObjectCategoryName; // Tên
    private Boolean isActive; // Tình trạng còn sử dụng
    private String asuCodeID;
    private UUID parentID;
}
