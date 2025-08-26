package id.ids.test.dto;

import lombok.Data;
import lombok.Setter;

@Data
public class DataDTO {
    private Integer id;
    private String productID;
    private String productName;
    private String amount;
    private String customerName;
    private Integer status;
    private String transactionDate;
    private String createBy;
    private String createOn;
}
