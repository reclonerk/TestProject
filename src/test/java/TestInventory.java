import com.rahul.Exercise20Aug.Customer;
import com.rahul.Exercise20Aug.Inventory;
import com.rahul.Exercise20Aug.Purchase;
import com.rahul.Exercise20Aug.Tshirt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestInventory {
    @Test
    public void testAddCustomer(){
        Customer c = new Customer();
        c.setName("Rahul");
        Customer res = Inventory.addCustomer("Rahul");
//        assertEquals(c.getName(), Inventory.addCustomer("Rahul").getName());
        assertEquals(c.getName(), res.getName());
    }

    @Test
    public void testAddTshirt(){
        Tshirt t = new Tshirt();
        t.setType("X");
        t.setQuantity(10);
        Tshirt res = Inventory.addTshirt("X");
//        assertEquals(t, Inventory.addTshirt("X"));
        assertEquals(t.getQuantity(), res.getQuantity());
        assertEquals(t.getType(), res.getType());
    }

    @Test
    public void testAddPurchase(){
        Customer c = new Customer();
        c.setName("Rahul");
        Tshirt t = new Tshirt();
        t.setType("X");
        Purchase p = new Purchase();
        p.setCustomer(c);
        p.setTshirt(t);
        p.setQuantity(1);

        Purchase res = Inventory.addPurchase(c, t);
//        assertEquals(p, Inventory.addPurchase(c, t));
        assertEquals(p.getCustomer().getName(), res.getCustomer().getName());
        assertEquals(p.getTshirt().getType(), res.getTshirt().getType());
    }

}
