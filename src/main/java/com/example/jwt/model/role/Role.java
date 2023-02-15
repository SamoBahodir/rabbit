package com.example.jwt.model.role;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO,generator = "role_id_seq")
    private Long id;
    private RoleName name;

}
