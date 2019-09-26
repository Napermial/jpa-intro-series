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

    @OneToMany(mappedBy = "season")
    private List<Season> seasons;

    @Transient
    private Integer numberOfSeasons;
}
