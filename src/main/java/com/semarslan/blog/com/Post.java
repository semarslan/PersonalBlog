package com.semarslan.blog.com;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 255)
    private String title;

    @NotNull
    @Size(min = 2)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "post_category",
//            joinColumns = @JoinColumn(name="id"),
//            inverseJoinColumns = @JoinColumn(name = "categoryId"))
//    private Set<Category> categories = new HashSet<>();

    private String image;

}
