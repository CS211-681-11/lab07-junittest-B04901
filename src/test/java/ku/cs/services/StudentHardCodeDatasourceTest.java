package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    @DisplayName("ทดสอบการเรียกใช้ StudentHardCodeDatasourceTest จาก readData")
    void testReadDataReturnsCorrectStudents() {
    StudentHardCodeDatasource  datasource = new StudentHardCodeDatasource();
    StudentList studentList = datasource.readData();
    ArrayList<Student> students = studentList.getStudents();

    assertEquals(4, students.size(), "expected 4 students in the list");

        assertEquals("6710400001", students.get(0).getId());
        assertEquals("First", students.get(0).getName());

        assertEquals("6710400002", students.get(1).getId());
        assertEquals("Second", students.get(1).getName());

        assertEquals("6710400003", students.get(2).getId());
        assertEquals("Third", students.get(2).getName());

        assertEquals("6710400004", students.get(3).getId());
        assertEquals("Fourth", students.get(3).getName());
    }
}