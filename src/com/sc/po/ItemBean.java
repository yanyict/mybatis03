package com.sc.po;

public class ItemBean {
    private Integer id;

    private OrderBean order;

    private String itemName;

    private Integer itemNum;

    private Float itemPrice;

    private Float itemMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderBean getOrder() {
		return order;
	}

	public void setOrder(OrderBean order) {
		this.order = order;
	}

	public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Float getItemMoney() {
        return itemMoney;
    }

    public void setItemMoney(Float itemMoney) {
        this.itemMoney = itemMoney;
    }
}