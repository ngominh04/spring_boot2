package com.vn.devmaster.quanlysinhvien.demosinhvien.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentSubjectDto implements Serializable {
    Integer point;
}