package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
   StudentList students;
    @BeforeEach
    void setUp(){
        students = new StudentList();
    }

    @Test
    void testaddNewStudent(){
        students.addNewStudent("12345678", "test",56.7);
        assertEquals(1,students.getStudents().size());
    }
    @Test
    void testaddNewStudent2(){
        students.addNewStudent("12345678", "test",56.7);
        students.addNewStudent("123456789", "test2",56.7);
        assertEquals(2,students.getStudents().size());
    }
    @Test
    void testfindStudentById(){
        students.addNewStudent("12345678", "test",56.7);
        Student test =  new Student("12345678", "test",56.7);
        assertEquals("test",students.findStudentById("12345678").getName());
    }
    @Test
    void testfindfilterByName(){
        students.addNewStudent("12345678", "b",56.7);
        students.addNewStudent("123456789", "a",56.7);
        assertEquals(1,students.filterByName("b").getStudents().size());
    }
    @Test
    void testgiveScoreToId(){
        students.addNewStudent("12345678", "test",0);
        students.giveScoreToId("12345678",30);
        assertEquals(30,students.findStudentById("12345678").getScore());
    }
    @Test
    void testviewGradeOfId(){
        students.addNewStudent("12345678", "test",0);
        assertEquals("F",students.viewGradeOfId("12345678"));
    }
    @Test
    void testgetStudents(){
        students.addNewStudent("12345678", "test",0);
        students.addNewStudent("123456789", "test2",0);
        students.addNewStudent("1234567810", "test3",0);
        assertEquals(3,students.getStudents().size());
    }
}