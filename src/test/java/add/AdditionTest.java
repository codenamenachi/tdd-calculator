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

    // test 4
    @Test
    void addNumbersTest_MoreThanTwoNums(){
        testCase = "1,2,1,3,2";
        int result = 0;
        try {
            result = addition.add(testCase);
        } catch (Exception e) {
            assert false;
        }
        assert result  == 9;
    }

    // test 5
    @Test
    void addNumbersTest_DiffDelimiters(){
        testCase = "1,2\n1";
        int result = 0;
        try {
            result = addition.add(testCase);
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assert result  == 4;
    }

    // test 6
    @Test
    void addNumbersTest_Negetives(){
        testCase = "1,-2, -3";
        int result = 0;
        try {
            result = addition.add(testCase);
        } catch (Exception e) {
            assert e.getMessage().equalsIgnoreCase("negatives not allowed - -2, -3");
        }
        assert false;
    }
}
