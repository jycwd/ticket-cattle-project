package com.ticket.pojo;


import javax.xml.crypto.Data;

/**
 * 没有撤退可言
 **/

public class order{
//    订单id
    private Integer order_id;
//    订单编号
    private Integer order_num;
//    订单状态
    private Integer order_state;
//    取票人
    private Integer userID;
//    所属演出id
    private Integer show_id;
//    定单生成时间
    private Data craete_time;
//    订单结束时间
    private Data over_time;
//    折扣
    private Double discount;
//    购票数量
    private Integer ticket_count;
//    收货地址id
    private Integer o_address_id;

}
