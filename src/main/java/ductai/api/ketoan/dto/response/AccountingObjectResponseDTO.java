package ductai.api.ketoan.dto.response;

import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountingObjectResponseDTO implements Serializable {
    private UUID id;
    private String name;
    private UUID accountingObjectCategoryID;
    private boolean inActive;
    private String address;
    private String tel;
    private String fax;
    private String email;

}
