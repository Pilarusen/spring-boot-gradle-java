package pl.nullpointerexception.restapi.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long postId;
    private String content;
    private LocalDateTime created;



    // moja błędna próba rozwiązania błędu
//    @Id
//    @GeneratedValue
//
//
//    @NotNull
//    @BatchSize(size = 100)
//    @Column(unique = true)
//    protected Long id;
//    private long postId;
//    private String content;
//    private LocalDateTime created;


}
