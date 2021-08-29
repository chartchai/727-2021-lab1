package th.ac.camt.automatedtest.tdd.service.stubPii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentServiceImplTest {

    @Test
    void getStudentGPAHigher() {
        StudentDao studentDao = mock(StudentDao.class);
        //setup
        when(studentDao.getStudents()).thenReturn(
                Arrays.asList(
                        new Student("001","Pii",2.6,101),
                        new Student("002","Nan",2.5,101),
                        new Student("001","Ploy",2.8,102),
                        new Student("002","Kong",3.8,102)

                )
        );
        StudentService studentService = new StudentServiceImpl(studentDao);
        assertThat(studentService.getStudentGPAHigher(3.0),
                hasItems(new Student("002","Kong",3.8,102)
        ));
    }

    @Test
    void getStudentGPALower() {
    }
}