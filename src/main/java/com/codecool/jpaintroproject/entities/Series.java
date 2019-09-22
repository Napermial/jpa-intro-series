package com.codecool.jpaintroproject.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Series {

    @Id
    private Long id;
    private String title;

    @OneToMany(mappedBy = "series")
    private List<Series> series;

    @Transient
    private Integer numberOfSeasons;
}
