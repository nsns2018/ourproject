package com.example.a1.hhapp.Model;

import java.util.List;

public class Request {
    private String deviceid;
    private String total;
   // private String status;
    private List<Order> foods;
    private boolean partial = false;

    public Request() {
    }

    public Request(String deviceid, String total, List<Order> foods) {
        this.deviceid = deviceid;
        this.total = total;
        this.foods = foods;
       // this.status = "0"; //Default is 0, 0:Placed, 1: Shipping, 2: Shipped
    }

    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String phone) {
        this.deviceid = deviceid;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
