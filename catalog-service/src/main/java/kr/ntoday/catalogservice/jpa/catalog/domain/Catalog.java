package kr.ntoday.catalogservice.jpa.catalog.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_catalog")
public class Catalog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Long id;

    @Column(name = "product_id", nullable = false, length = 120, unique = true)
    private String productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "unit_price", nullable = false)
    private Integer unitPrice;

    @Column(name = "create_at", nullable = false, insertable = false, updatable = false)
    @ColumnDefault(value ="CURRENT_TIMESTAMP")
    private LocalDateTime createAt;
}
