import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);
    }

    @Test
    public void testNoTriangle() {

        // Arrange
        float a = 10;
        float b = 2;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test

    public void testNoTriangle2() {

        // Arrange
        float a = 10;
        float b = 5;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNegativeTriangle() {

        // Arrange
        float a = -2;
        float b = -3;
        float c = -1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

     @Test
    public void testTriangleZero() {

        // Arrange
        float a = 0;
        float b = 0;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testTriangle2Zero() {

        // Arrange
        float a = 0;
        float b = 0;
        float c = 7;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    
     @Test
    public void testTriangleZeroA() {

        // Arrange
        float a = 0;
        float b = 5;
        float c = 7;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

      @Test
    public void testTriangleZeroB() {

        // Arrange
        float a = 5;
        float b = 0;
        float c = 7;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

      @Test
    public void testTriangleZeroC() {

        // Arrange
        float a = 5;
        float b = 7;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    
    @Test
    public void testIsoscelesTriangleC() {

        // Arrange
        float a = 5;
        float b = 5;
        float c = 8;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleB() {

        // Arrange
        float a = 5;
        float b = 8;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

@Test
    public void testIsoscelesTriangleA() {

        // Arrange
        float a = 8;
        float b = 5;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }
    
    @Test
    public void testIsoscelesTriangle() {

        // Arrange
        float a = 5;
        float b = 5;
        float c = 8;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    
    @Test
    public void testEquilateralTriangle() { 

        // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }

}
