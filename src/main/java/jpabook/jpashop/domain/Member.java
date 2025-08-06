package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    // 여기서 member는 Order 테이블에서 연관관계를 맺고있는 Member member의 member임
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
