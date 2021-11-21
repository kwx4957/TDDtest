package com.test.intellij;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ExmTest {


    @Test
    @DisplayName("should demonstarte a simple assertion support")
    void zzzzz() {
        assertEquals(1, 1);

    }

//    @Test
//    @DisplayName("should check all iemts in tthe List")
//    void shouldCheckAllIemtsInTtheList() {
//        List<Integer> numebers = List.of(2, 3, 4, 5);
//        Assertions.assertAll(() -> assertEquals(2, numebers.get(0)),
//                () -> assertEquals(3, numebers.get(1)),
//                () -> assertEquals(4, numebers.get(2)),
//                () -> assertEquals(5, numebers.get(3)));
//
//    }

    @Test
    @DisplayName("should only run the test if some criteria are met")
    void shouldOnlyRunTheTestIfSomeCriteriaAreMet() {
        Assumptions.assumeTrue(15 < 10);
        assertEquals(1, 1);
    }

    @ParameterizedTest(name = "{0}")
    @DisplayName("should create shapres with diff number")
    @ValueSource(ints = {3, 4, 6, 7, 8})
    void shouldCreateShapresWithDiffNumber(int expectNumberOfSides) {
        Shape shape = new Shape(expectNumberOfSides);
        assertEquals(expectNumberOfSides, shape.getNunmberOfsides());

    }

    @ParameterizedTest
    @DisplayName("shoudnot create shapes with invalid numebre of sides")
    @ValueSource(ints = {0,1,2, Integer.MAX_VALUE})
    void shoudnotCreateShapesWithInvalidNumebreOfSides(int expectNumberOfSides) {
        assertThrows(IllegalArgumentException.class,
                        () -> new Shape(expectNumberOfSides));
        
    }
    @Nested
    @DisplayName("When a shape has been created")
    class WhenShapeExiset{
        private  final  Shape shape = new Shape(4);

        @Nested
        @DisplayName("shlow allow")
        class ShouldAllow{

            @Test
            @DisplayName("seeing the number of sieds")
            void seeingTheNumberOfSieds() {
                assertEquals(4,shape.getNunmberOfsides());

            }

            @Test
            @DisplayName("seeinf the description")
            void seeinfTheDescription() {
                assertEquals("Square",shape.description());
                
            }
        }
        @Nested
        @DisplayName("shoud not")
        class ShouldNot{
            @Test
            @DisplayName("be equal to another shape with same number of sides")
            void beEqualToAnotherShapeWithSameNumberOfSides() {
                assertNotEquals(new Shape(4),shape);
                
            }
        }
    }


}