package com.vn.devmaster.quanlysinhvien.demosinhvien.controller;

import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Adress;
import com.vn.devmaster.quanlysinhvien.demosinhvien.domain.Student;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.AddressDTO;
import com.vn.devmaster.quanlysinhvien.demosinhvien.dto.StudentDTO;
import com.vn.devmaster.quanlysinhvien.demosinhvien.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    List<Student> getAll(){
        return studentService.getAll();
    }
    @PostMapping("/student")
    String save(@RequestBody StudentDTO student){
        studentService.save(student);
        return "ok";
    }

    @PostMapping("/students")
    String save(@RequestBody List<StudentDTO> dtos){
        studentService.save( dtos);
        return "okkkkkkkkkk";
    }

//    @GetMapping("/filter-name")
//    List<Student> filterByName(@RequestParam("name") String name){
//        List<Student> dtos=studentService.filterByName(name);
//        return dtos;
//    }
    @GetMapping("/filter-name")
    List<StudentDTO> filterByName(@RequestParam("name") String name){
        List<StudentDTO> dtos=studentService.filterByName(name);
        return dtos;
    }

    @GetMapping("/AllAddress")
    List<AddressDTO> getAllAddress(){
        List<AddressDTO> dtos=studentService.getAllAddress();
        return dtos;
    }

    @GetMapping("/getOneAddress")
    AddressDTO getOneAddress(@Param("id") Integer id){
        return studentService.getOneAddress(id);
    }

    @GetMapping("/AddressHN")
    List<StudentDTO> getAddressHN(){
        List<StudentDTO> studentDTOS=studentService.getAddressHN();
        return studentDTOS;
    }

    // lấy ra sinh viên học lớp DEV01
    @GetMapping("/Classes_DEV01")
    List<StudentDTO> getClasses_DEV01(){
        List<StudentDTO> studentDTOS=studentService.getClasses_DEV01();
        return studentDTOS;
    }

    //Lấy ra sinh viên học môn toán
    @GetMapping("/Subject_Toan")
    List<StudentDTO> getSubject(){
        List<StudentDTO> studentDTOS=studentService.getSubject();
        return studentDTOS;
    }

    // lấy ra những sinh viên có điểm >=8
    @GetMapping("/Point")
    List<StudentDTO> getPoint(){
        List<StudentDTO> studentDTOS=studentService.getPoint();
        return studentDTOS;
    }
}
