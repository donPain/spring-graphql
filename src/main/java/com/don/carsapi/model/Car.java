package com.don.carsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_car")
public class Car implements BaseModel<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id" ,length = 36, nullable = false, updatable = false)
    private UUID uuid;

    private String model;

    @Override
    @JsonIgnore
    public UUID getId() {
        return this.uuid;
    }

}
