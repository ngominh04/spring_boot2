package com.vn.devmaster.quanlysinhvien.demosinhvien.mapper;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.StudentSubject;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.StudentSubjectDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentSubjectMapper implements EntityMapper<StudentSubject, StudentSubjectDto>{
    @Override
    public StudentSubject toEntity(StudentSubjectDto studentSubjectDto) {
        return null;
    }

    @Override
    public List<StudentSubject> toEntity(List<StudentSubjectDto> d) {
        return null;
    }

    @Override
    public StudentSubjectDto toDto(StudentSubject studentSubject) {
        return StudentSubjectDto.builder().point(studentSubject.getPoint()).build();
    }

    @Override
    public List<StudentSubjectDto> toDto(List<StudentSubject> e) {
        List<StudentSubjectDto> dtos=new ArrayList<>();
        e.forEach(studentSubject -> dtos.add(toDto(studentSubject)));
        return dtos;
    }
}
