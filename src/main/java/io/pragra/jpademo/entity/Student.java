package io.pragra.jpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 255)
    private String name;

    @Builder.Default
    private Instant createDate = Instant.now();

    @Builder.Default
    private Instant updateDate = Instant.now();

    @OneToOne(fetch = FetchType.LAZY )
    private StudentPermit permit;

    @Transient
    private String funnyName;
}
