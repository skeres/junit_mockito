package com.test.interfaces;

import com.sks.exception.DataCannotBeNull;
import com.sks.utils.ConstructProduct;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.DisplayNameGenerator;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TestIdaoProduit {

    ConstructProduct cp=null;
    @Mock ConstructProduct mockConstructProduct;


    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
         }

    @BeforeEach
    void init() {
        // On prépare le scénario de test
        cp = new ConstructProduct();
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Test
    @DisplayName("someDatasAreNull")
    public void someDatasAreNull() {
        // On vérifie les résultats
        Assertions.assertThrows(DataCannotBeNull.class, () -> {
            cp.setFunctionalName("a", null, null);
        });
    }

    @Test
    @DisplayName("orderFunctionalNameIRespected")
    public void order_functional_name_is_respected() {
        Assertions.assertEquals("yaourt danone bio", cp.setFunctionalName("yaourt", "danone","bio"),"order is respected");
    }


    //Mockito
    @Test
    @DisplayName("shouldReturnYaourtDanoneBio")
    public void shouldReturnYaourtDanoneBio() {
        when(mockConstructProduct.getFunctionalName("1234567890123")).thenReturn("yaourt danone bio");
        Assertions.assertEquals("yaourt danone bio", mockConstructProduct.getFunctionalName("1234567890123"));


    }

}
