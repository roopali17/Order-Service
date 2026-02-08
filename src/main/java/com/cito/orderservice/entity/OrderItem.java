package com.cito.orderservice.entity;
import jakarta.persistence.*;
@Entity
public class OrderItem
{

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       @ManyToOne
       @JoinColumn(name = "order_id")
       private Order order;
       private  Long menuItemId;
       private String itemName;
       private Integer  quantity;
       private Double unitPrice;
       private Double subtotal;

       public void setId(Long id)
       {
           this.id = id;
       }
       public Long getId()
       {
           return id;
       }
       public void setOrder(Order order)
       {
           this.order = order;
       }

    public Order getOrder()
    {
        return order;
    }
    public void  setMenuItemId(Long menuItemId)
    {
        this.menuItemId = menuItemId;
    }
    public Long getMenuItemId()
    {
        return menuItemId;
    }
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }
    public String getItemName()
    {
        return itemName;
    }
    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public void setUnitPrice(Double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
    public Double getUnitPrice()
    {
        return unitPrice;
    }
    public void setSubtotal(Double subtotal)
    {
        this.subtotal = subtotal;
    }
    public Double getSubtotal()
    {
        if(quantity!=null && unitPrice!=null) {
            subtotal = quantity * unitPrice;
            return  subtotal;
        }
        else {
            return 0.0;
        }
    }
}
