package com.techfolks.openapi.productservice.api;

import com.techfolks.openapi.productservice.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class ProductController implements ProductsApi {
    @Override
    public ResponseEntity<List<Product>> productsGet(@Min(10) @Max(20) @Valid Integer bodylimit, @Min(1) @Max(5) @Valid Integer pagelimit) {
        return null;
    }

    @Override
    public ResponseEntity<Product> productsIdGet(Integer id) {
        return null;
    }


    @Override
    public ResponseEntity<Void> productsPost(@Valid Product body) {
        return null;
    }
}
