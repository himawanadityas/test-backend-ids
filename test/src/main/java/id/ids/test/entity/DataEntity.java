package id.ids.test.entity;

import id.ids.test.dto.StatusDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "data")
@Setter
@Getter
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "\"productID\"")
    private String productID;
    @Column(name = "\"productName\"")
    private String productName;
    @Column(name = "\"amount\"")
    private String amount;
    @Column(name = "\"customerName\"")
    private String customerName;
    @Column(name = "\"transactionDate\"")
    private String transactionDate;
    @Column(name = "\"createBy\"")
    private String createBy;
    @Column(name = "\"createOn\"")
    private String createOn;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "status", nullable = false)
    private StatusEntity status;
}
