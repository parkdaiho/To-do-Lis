package me.parkdaiho.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tasks")
@Getter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String contents;

    @Builder
    public Task(String contents) {
        this.contents = contents;
    }

    public Task update(String contents) {
        this.contents = contents;

        return this;
    }
}
