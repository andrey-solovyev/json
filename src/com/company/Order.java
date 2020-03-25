package com.company;

public class Order {
    private ContackInfo contackInfo;
    private DeliveryAddress deliveryAddress;
    private Good[] goods;

    public Order(ContackInfo contackInfo, DeliveryAddress deliveryAddress, Good[] goods) {
        this.contackInfo = contackInfo;
        this.deliveryAddress = deliveryAddress;
        this.goods = goods;
    }

    public ContackInfo getContackInfo() {
        return contackInfo;
    }

    public void setContackInfo(ContackInfo contackInfo) {
        this.contackInfo = contackInfo;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Good[] getGoods() {
        return goods;
    }

    public void setGoods(Good[] goods) {
        this.goods = goods;
    }
}
