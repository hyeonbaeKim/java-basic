package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    //주문할 때 주문하는 사용자와 상품정보를 알고나서 메모리 할당!
    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
