package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
     Student s;
    //test method
    // if we have annotated and method after that will have to test

    @BeforeAll //look like constructor test >> run 1 time when initial class test
    static void initial(){
        //s = new Student("62xxxxxxxxx", "Student");
    }
    @BeforeEach // run every time when you call method test >> initial field to test
    void setUp(){
         s = new Student("12345678", "test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15")
    void testAddScore(){ // 1 test method have 1 test only!!

        s.addScore(45.12);
        //compare to variable equal,more than , less than
        assertEquals(45.12,s.getScore()); // compare equal(Expected,Actual)
    }
    @Test
    @DisplayName("Test cal grade")
    void testGetGrade(){
        s.addScore(1);
        assertEquals("F",s.getGrade());
    }
    @Test
    @DisplayName("test change name.")
    void  testChangeName(){
        s.changeName("John");
        assertEquals("John",s.getName());
    }
    @Test
    void testisId(){
        assertTrue(s.isId("12345678"));
    }
    @Test
    void testisNameContains(){
        assertEquals("test",s.getName());
    }
    @Test
    void  testgetId(){
        assertEquals("12345678",s.getId());
    }
    @Test
    void testgetName(){
        assertEquals("test",s.getName());
    }

}