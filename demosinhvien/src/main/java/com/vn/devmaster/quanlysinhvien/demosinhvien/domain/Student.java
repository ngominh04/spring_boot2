package com.vn.devmaster.quanlysinhvien.demosinhvien.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @OneToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "id_address")
    Adress address;

//    @ManyToMany
    @ManyToMany
        @JoinTable(
                name = "student_subject",
                joinColumns = @JoinColumn(name = "id_student"),
                inverseJoinColumns = @JoinColumn(name = "id_subject")
        )
    List<Subject> subjects=new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "classes_id")
    @Fetch(FetchMode.JOIN)
    private Classes classes;

}
