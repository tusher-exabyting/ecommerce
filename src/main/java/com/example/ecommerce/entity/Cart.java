package com.example.ecommerce.entity;

import com.example.ecommerce.constant.db.DbConstant;
import com.example.ecommerce.constant.db.DbConstant.DbCommon;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = DbConstant.DbCart.TABLE_NAME)
public class Cart extends AuditInfo {

    @Column(name = DbConstant.DbCart.TOTAL_AMOUNT)
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItem> items = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
