package add;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
class AdditionTest {

    @Mock
    private Addition addition;

    String testCase;

    // test 1
    @Test
    void addNumbersTest_Blank(){
        testCase = "";
        int result = addition.add(testCase);
        assert result  == 0;
    }

    // test 2
    @Test
    void addNumbersTest_OneNum(){
        testCase = "1";
        int result = addition.add(testCase);
        assert result  == 1;
    }

    // test 3
    @Test
    void addNumbersTest_TwoNums(){
        testCase = "1,2";
        int result = addition.add(testCase);
        assert result  == 3;
    }
}
