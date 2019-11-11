import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

        //Test suite for classes of ShapeCollector
        private static int testCounter = 0;

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }
        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }
        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
       @Test
       public void testAddFigure() {
           //Given
           ArrayList<Shape> shapeList = new ArrayList<>();
           Shape square = new Square("square", 12);
           Shape triangle = new Triangle("triangle", 5, 24);
           Shape circle = new Circle("circle", 2);
           shapeList.add(square);
           shapeList.add(triangle);
           shapeList.add(circle);
           //When
           int numberOfShapes = shapeList.size();
           //Then
           assertEquals(3, numberOfShapes);
       }
       @Test
       public void testRemoveFigure() {
           //Given
           ArrayList<Shape> shapeList = new ArrayList<>();
           Shape square = new Square("square", 12);
           Shape triangle = new Triangle("triangle", 5, 24);
           Shape circle = new Circle("circle", 2);
           shapeList.add(square);
           shapeList.add(triangle);
           shapeList.add(circle);
           shapeList.remove(1);
           shapeList.remove(1);
           //When
           int numberOfShapes = shapeList.size();
           //Then
           assertEquals(1, numberOfShapes);
       }
       @Test
       public void testGetFigure() {
           //Given
           ArrayList<Shape> shapeList = new ArrayList<>();
           Shape square = new Square("square", 12);
           Shape triangle = new Triangle("triangle", 5, 24);
           Shape circle = new Circle("circle", 2);
           shapeList.add(square);
           shapeList.add(triangle);
           shapeList.add(circle);
           //When
           Shape testGetShape = shapeList.get(2);
           //Then
           assertEquals(circle, testGetShape);
       }
       @Test
       public void testShowFigures() {
           //Given
           Shape square = new Square("square", 12);
           Shape triangle = new Triangle("triangle", 5, 24);
           Shape circle = new Circle("circle", 2);
           //When
           String squareName = square.getShapeName();
           String triangleName = triangle.getShapeName();
           String circleName = circle.getShapeName();
           double squareField = square.getField();
           double triangleField = triangle.getField();
           double circleField = circle.getField();
           //Then
           assertEquals("square", squareName);
           assertEquals("triangle", triangleName);
           assertEquals("circle", circleName);
           assertEquals(144, squareField, 0.05);
           assertEquals(60, triangleField, 0.05);
           assertEquals(12.5, circleField, 0.5);
       }
   }