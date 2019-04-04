package tacos.domain;

import lombok.Data;

import java.util.List;


@Data
public class Taco {

    private  long id;
    private String name;
    private List<Ingredient> ingredients;
}
