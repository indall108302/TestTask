package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Client")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nickname")
    private String nickname;

    @Column(name = "diskount1")
    private Double diskount1;

    @Column(name = "diskount2")
    private Double diskount2;
}
