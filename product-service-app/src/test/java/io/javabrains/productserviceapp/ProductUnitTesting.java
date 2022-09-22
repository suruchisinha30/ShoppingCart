package io.javabrains.productserviceapp;

import io.javabrains.productserviceapp.controller.ProductController;
import io.javabrains.productserviceapp.model.Product;
import io.javabrains.productserviceapp.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductUnitTesting {

    @Autowired
    private ProductController productController;
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ProductService productService;
    @Test
    public void getProductByIdTest() throws Exception {
        Product product = new Product();
        product.setProductType("Smartphones");
        product.setProductName("OnePlus 10 Pro");
        product.setCategory("Electronics");
        product.setPrice(71999.0);
        product.setDescription("Flagship mobile of OnePlus");

        when(productService.getProductById(anyInt())).thenReturn(product);

        mockMvc.perform(MockMvcRequestBuilders.get("/product/1"))
                .andExpect(MockMvcResultMatchers.jsonPath("productType").value("Smartphones"))
                .andExpect(MockMvcResultMatchers.jsonPath("productName").value("OnePlus 10 Pro"))
                .andExpect(MockMvcResultMatchers.jsonPath("category").value("Electronics"))
                .andExpect(MockMvcResultMatchers.jsonPath("price").value(71999.0))
                .andExpect(MockMvcResultMatchers.jsonPath("description").value("Flagship mobile of OnePlus"))
                .andExpect(status().isOk());
    }
}
