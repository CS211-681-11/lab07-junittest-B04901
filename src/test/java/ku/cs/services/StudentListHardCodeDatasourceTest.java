package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {

    @Test
    @DisplayName("ทดสอบการเรียกใช้ StudentListHardCodeDatasourceTest จาก readData")
    void testReadDataReturnsCorrectStudents() {
        StudentListHardCodeDatasource  datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();
        ArrayList<Student> students = studentList.getStudents();

        assertEquals(10, students.size(), "expected 10 students in the list");


                assertEquals("6710400001", students.get(0).getId());
                assertEquals("First", students.get(0).getName());

                assertEquals("6710400002", students.get(1).getId());
                assertEquals("Second", students.get(1).getName());

                assertEquals("6710400003", students.get(2).getId());
                assertEquals("Third", students.get(2).getName());

                assertEquals("6710400004", students.get(3).getId());
                assertEquals("Fourth", students.get(3).getName());

                assertEquals("6710400005", students.get(4).getId());
                assertEquals("Fifth", students.get(4).getName());

                assertEquals("6710400006", students.get(5).getId());
                assertEquals("Sixth", students.get(5).getName());

                assertEquals("6710400007", students.get(6).getId());
                assertEquals("Seventh", students.get(6).getName());

                assertEquals("6710400008", students.get(7).getId());
                assertEquals("Eighth", students.get(7).getName());

                assertEquals("6710400009", students.get(8).getId());
                assertEquals("Ninth", students.get(8).getName());

                assertEquals("67104000010", students.get(9).getId());
                assertEquals("Tenth", students.get(9).getName());
    }
}