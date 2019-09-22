package com.codecool.jpaintroproject.entities;

import com.codecool.jpaintroproject.TvAiredOn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Episode {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDate aired;

    @Enumerated(EnumType.STRING)
    private TvAiredOn tvAiredOn;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Season season;
}
