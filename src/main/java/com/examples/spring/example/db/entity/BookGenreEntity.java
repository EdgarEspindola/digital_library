package com.examples.spring.example.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_genres")
@IdClass(BookGenreEntityPK.class)
public class BookGenreEntity {
    @Id
    @Column(name = "book_id")
    private Long bookId;

    @Id
    @Column(name = "genre_id")
    private Long genreId;
}
