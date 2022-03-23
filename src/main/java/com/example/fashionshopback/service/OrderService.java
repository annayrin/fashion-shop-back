package com.example.fashionshopback.service;

import com.example.fashionshopback.model.Order;
import com.example.fashionshopback.model.dto.OrderUpdateReqDto;

import java.util.List;

public interface OrderService {

        Order create(Order order);

        Order getById(long id);

        List<Order> getAll();

        Order update(long id, OrderUpdateReqDto order);

        void delete(long id);

}
