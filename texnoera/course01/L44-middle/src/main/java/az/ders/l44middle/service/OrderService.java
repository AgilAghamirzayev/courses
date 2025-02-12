package az.ders.l44middle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

//    @Autowired
//    OrderService orderService;
//
//    @Transactional(propagation = Propagation.REQUIRED)
//    public void placeOrder() {
//        orderService.saveOrder();
//        orderService.sendInvoice();
//    }
//
//    public void saveOrder() {
//        // Saves the order with a transaction
//    }
//
//    public void sendInvoice() {
//        throw new RuntimeException("Cannot save order");
//    }
}