package it.epicode.week2.day3.esercizio;

public class Customer {

    private Long id;
    private String name;
    private Integer tier;


    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    // Metodi Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }

    // Metodi Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

}
