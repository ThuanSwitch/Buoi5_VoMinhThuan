package com.example.lexuanngo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Controller;

public class Product {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    @NotBlank(message = "ten san pham khong duoc de trong")
    private String name;
    @Getter
    @Setter
    @Length(min =0,max =50,message = "ten khong qua 50 ky tu")
    private String image;
    @Getter
    @Setter
    @NotNull(message = "Gia san pham khong duoc de trong")
    @Min(value = 1,message = "gia san pham khong duoc nho hon 1")
    @Max(value=999999999,message = "gia san pham khong duoc qua  999999999")
    private long price;

    public Product(int id, String name, String image, long price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }
    public Product() {
    }

}
