package com.shivansh.clb.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true, nullable = false)
    private Long githubId;

    @Column(nullable = false, length = 255)
    private String githubUsername;

    private String displayName;

    private String avatarUrl;

    @Column(columnDefinition = "TEXT")
    private String accessToken;

    private String tokenScopes;

    @CreationTimestamp
    @Column(updatable = false)
    private Instant createdAt;

}
