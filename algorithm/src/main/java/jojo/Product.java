package jojo;

import lombok.Data;

@Data
public class Product implements Comparable<Product>{

    private String username;

    private  int age;

    @Override
    public int compareTo(Product o) {
        return this.getAge() - o.getAge();
    }
}
