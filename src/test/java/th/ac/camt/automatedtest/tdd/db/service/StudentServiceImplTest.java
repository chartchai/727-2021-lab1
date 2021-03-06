package th.ac.camt.automatedtest.tdd.db.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.db.dao.StudentDao;
import th.ac.camt.automatedtest.tdd.stub.sample.Student;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

class StudentServiceImplTest {
    StudentDao studentDao = null;
    @BeforeEach
    void init(){
        studentDao = mock(StudentDao.class);
        when(studentDao.getAllStudent()).thenReturn(
                Arrays.asList(new Student("001","Pii",2.6),
                        new Student("002","Nan",2.5),
                        new Student("003","Ploy",2.8),
                        new Student("001","Kong",3.8)
                )
        );

    }
    @Test
    void getStudentGPALessThan() {

        StudentService studentService = new StudentServiceImpl(studentDao);
        assertThat(studentService.getStudentGPALessThan(2.7),
                hasItems(new Student("001","Pii",2.6),
                        new Student("002","Nan",2.5)));
        verify(studentDao,times(10)).getAllStudent();
    }

    @Test
    void testGetStudentGPALessThan() {

        StudentService studentService = new StudentServiceImpl(studentDao);
        assertThat(studentService.getStudentGPAHigherThan(2.7),
                hasItems(new Student("003","Ploy",2.8),
                        new Student("001","Kong",3.8)));
    }

    @Test
    void testGetStudentGPALessThan1() {

        StudentService studentService = new StudentServiceImpl(studentDao);
        assertThat(studentService.getStudentById("003"),
                is(new Student("003","Ploy",2.8)));
    }
}