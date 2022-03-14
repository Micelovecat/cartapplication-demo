package pro.sky.cartapplicationdemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.cartapplicationdemo.cart.Cart;
import pro.sky.cartapplicationdemo.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return cart.addItems(items);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
