package DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringConcatenationTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
            { "Hello", " World!", "Hello World!" },  // Test data: str1, str2, expected result
            { "Test", " DataProvider", "Test DataProvider" },
            { "This", " is a string test.", "This is a string test." },
        };
    }

    @Test(dataProvider = "testData")
    public void testStringConcatenation(String str1, String str2, String expectedResult) {
        String result = str1 + str2;
        assert result.equals(expectedResult) : "Test failed!";
    }
}
