package ku.cs.services;

import ku.cs.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource studentHardCodeDatasource;
    @BeforeEach
        // run every time when you call method test >> initial field to test
    void setUp(){
        studentHardCodeDatasource  = new StudentHardCodeDatasource();
    }
    @Test
    void testreadData(){
        assertEquals(1, studentHardCodeDatasource.readData().filterByName("First").getStudents().size());
    }
}