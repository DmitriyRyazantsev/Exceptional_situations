import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopRepositoryTest {

    Product product1 = new Product(11, "хлеб",  40);
    Product product2 = new Product(222, "булка",  30);
    Product product3 = new Product(3, "картошка",  20);




    @Test
    public void testRemove() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(3);

        Product[]  actual = repo.findAll();
        Product[] expected = {product1, product2};
    }

    @Test
    public void test() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(-100);
        });

    }
}