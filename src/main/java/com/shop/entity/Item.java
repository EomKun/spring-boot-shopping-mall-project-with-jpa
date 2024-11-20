package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 상품 Entity
 * <p>- id: 상품 코드</p>
 * <p>- itemNm: 상품 명</p>
 * <p>- price: 가격</p>
 * <p>- stockNumber: 재고 수량</p>
 * <p>- itemDetail: 상품 상세 설명</p>
 * <p>- itemSellStatus: 상품 판매 상태</p>
 * <p>- regTime: 등록 시간</p>
 * <p>- updateTime: 수정 시간</p>
 */

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(nullable = false)
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    private String itemDetail;

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
