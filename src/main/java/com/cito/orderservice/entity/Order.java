package com.cito.orderservice.entity;
import jakarta.persistence.*;
import java.util.*;
import com.cito.orderservice.enums.OrderStatus;
import java.time.LocalDateTime;
import com.cito.orderservice.entity.OrderItem;
@Entity
@Table(name = "orders")
public class Order
{
    //Fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long restaurantId;
    private String deliveryAddress;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private Double totalAmount;
    private LocalDateTime  orderDate;
    private LocalDateTime deliveryDate;
    private String specialInstructions;
    @OneToMany(mappedBy = "order" , cascade = CascadeType.ALL)
    private List<OrderItem> items;

    //Getter and Setter
    public void setId(Long id)
    {
        this.id = id;
    }
    public Long getId()
    {
        return id;
    }
    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }
    public Long getCustomerId()
    {
        return customerId;
    }
    public void setRestaurantId(Long restaurantId)
    {
        this.restaurantId = restaurantId;
    }
    public Long getRestaurantId()
    {
        return restaurantId;
    }
    public void setDeliveryAddress(String deliveryAddress)
    {

        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress()
    {
        return deliveryAddress;
    }
    public void setOrderStatus(OrderStatus status)
    {
        this.status = status;
    }
    public OrderStatus getOrderStatus()
    {
        return status;
    }
    public void setTotalAmount(Double totalAmount)
    {
        this.totalAmount = totalAmount;
    }
    public Double getTotalAmount()
    {
        return totalAmount;
    }
    public void setOrderDate(LocalDateTime orderDate)
    {
        this.orderDate = orderDate;
    }
    public LocalDateTime getOrderDate()
    {
        return orderDate;
    }
    public void setDeliveryDate(LocalDateTime deliveryDate)
{
    this.deliveryDate = deliveryDate;
}
    public LocalDateTime getDeliveryDate()
    {
        return deliveryDate;
    }
    public void setSpecialInstructions( String specialInstructions)
    {
        this.specialInstructions = specialInstructions;
    }
    public String getSpecialInstructions()
    {
        return specialInstructions;
    }
    public void setItems(List<OrderItem> items)
    {
        this.items = items;
    }
    public List<OrderItem> getItems()
    {
        return items;
    }
}
