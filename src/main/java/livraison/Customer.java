package livraison;

import java.util.UUID;

// // 3. **`class Customer`** : `String id`, `String name`, `String address`.
public class Customer {

    private UUID id;
    private String name;
    private String adress;

    public Customer(String name, String adress) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.adress = adress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + "]";
    }

}
