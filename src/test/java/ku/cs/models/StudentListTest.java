package ku.cs.models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList studentList;

    @BeforeEach
    void init(){
        studentList = new StudentList();
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนที่ไม่มีคะแนนเข้าไปในลิสต์ และเช็คขนาดของลิสต์")
    void testAddNewStudentWithoutScore(){
        studentList.addNewStudent("67XXXXXXXX", "StudentA");
        assertEquals(1, studentList.getStudents().size());
        assertEquals("StudentA", studentList.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนที่มีคะแนนเข้าไปในลิสต์ และเช็คขนาดของลิสต์")
    void testAddNewStudentWithScore(){
        studentList.addNewStudent("67XXXXXXX1", "StudentB", 85.6);
        assertEquals(1, studentList.getStudents().size());
        assertEquals("StudentB", studentList.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนซ้ำ")
    void testAddDuplicateStudent(){
        studentList.addNewStudent("67XXXXXXXX", "StudentA");
        studentList.addNewStudent("67XXXXXXXX", "StudentA");
        assertEquals(1, studentList.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบการหานักเรียนจาก ID")
    void testFindStudentById(){
        studentList.addNewStudent("67XXXXXXX2", "StudentC");
        Student foundStudent = studentList.findStudentById("67XXXXXXX2");
        assertNotNull(foundStudent);
        assertEquals("StudentC", foundStudent.getName());
    }

    @Test
    @DisplayName("ทดสอบการคัดกรองจากชื่อของนักเรียน")
    void testFilteredByName(){
        studentList.addNewStudent("67XXXXXXX1", "StudentA");
        studentList.addNewStudent("67XXXXXXX2", "StudentB");
        studentList.addNewStudent("67XXXXXXX3", "StudentC");
        studentList.addNewStudent("67XXXXXXX4", "Stu");

        StudentList filteredList = studentList.filterByName("Student");
        ArrayList<Student> filteredStudent = filteredList.getStudents();
        assertEquals(3, filteredStudent.size());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 65.5 คะแนน")
    void testGiveScoreToId(){
        studentList.addNewStudent("67XXXXXXX1", "StudentA");
        studentList.giveScoreToId("67XXXXXXX1", 65.5);

        Student student = studentList.findStudentById("67XXXXXXX1");
        assertNotNull(student);
        assertEquals(65.5, student.getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดจาก ID ของนักเรียน")
    void testViewGradeOfId(){
        studentList.addNewStudent("67XXXXXXX1", "StudentA", 95.0);
        String grade = studentList.viewGradeOfId("67XXXXXXX1");
        assertNotNull(grade);
        assertEquals("A", grade);
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดจาก ID ที่ไม่ได้อยู่ในระบบ")
    void testViewGradeOfInvalidId(){
        studentList.addNewStudent("67XXXXXXX1", "StudentA");
        String grade  = studentList.viewGradeOfId("67XXXXXXXX");
        assertNull(grade);
    }



}