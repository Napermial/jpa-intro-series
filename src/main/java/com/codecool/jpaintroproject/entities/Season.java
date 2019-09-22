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
public class Season {

    @Id
    @GeneratedValue
    private Long id;
    private Integer length;

    @OneToMany(mappedBy = "season", cascade = CascadeType.PERSIST)
    private List<Episode> episodes;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Series series;

    @Transient
    private Integer numberOfEpisodes;

}
