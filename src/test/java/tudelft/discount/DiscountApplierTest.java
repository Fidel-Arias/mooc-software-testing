package tudelft.discount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void testDiscountsAppliedCorrectly() {
        // Crear productos simulados
        Product homeProduct = new Product("Silla", 100.0, "HOME");
        Product businessProduct = new Product("Laptop", 200.0, "BUSINESS");
        Product otherProduct = new Product("Libro", 50.0, "EDUCATION"); // No se debe modificar

        List<Product> productList = Arrays.asList(homeProduct, businessProduct, otherProduct);

        // Crear el mock del DAO
        ProductDao mockDao = mock(ProductDao.class);

        // Definir el comportamiento del mock
        when(mockDao.all()).thenReturn(productList);

        // Crear instancia de la clase a probar con el mock
        DiscountApplier applier = new DiscountApplier(mockDao);

        // Ejecutar el método
        applier.setNewPrices();

        // Verificar resultados esperados
        assertEquals(90.0, homeProduct.getPrice(), 0.001);       // 100 * 0.9
        assertEquals(220.0, businessProduct.getPrice(), 0.001);  // 200 * 1.1
        assertEquals(50.0, otherProduct.getPrice(), 0.001);      // Sin cambio
    }
}

