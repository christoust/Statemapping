package com.UST.StateMapping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "district")
@IdClass(DistrictId.class)
public class District {

        @Id
        @Column(name = "state")
        private String state;

        @Id
        @Column(name = "district")
        private String district;

        // getters and setters
}


