package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน + score getter")
    void testAddScore(){
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อให้เป็น orn")
    void testNameChange() {
        s.changeName("orn");
        assertEquals("orn", s.getName());
    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบ ID")
    void testIsID() {
        assertTrue(s.isId("6xxxxxxxx"));
    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบว่ามีชื่อนักเรียนหรือไม่ และต้องไม่เป็น case sensitive")
    void testisNameContains() {
        assertTrue(s.isNameContains("studenttest"));
    }

    @Test
    @DisplayName("ทดสอบ name getter")
    void testGetName() {
        assertEquals("StudentTest", s.getName());
    }

    @Test
    @DisplayName("ทดสอบ grade getter")
    void testGetGrade() {
        assertEquals("F" , s.getGrade());
    }

    @Test
    @DisplayName("ทดสอบ ID getter")
    void testGetId() {
        assertEquals("6xxxxxxxx", s.getId());
    }


}