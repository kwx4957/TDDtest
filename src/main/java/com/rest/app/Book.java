package com.rest.app;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;

    @NonNull
    private String name;

    @NonNull
    private String summary;

    private int rating;
}
