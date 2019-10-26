package com.prolik.java.springbootstudy;

import java.math.BigDecimal;

/**
 * @author kang.li
 * @version $Id: .java, v 1.0 2019/9/26 kang.li Exp
 */
public class PayUploadVo {
    private String transaction_no;
    private String pay_order_no;
    private BigDecimal totalMoney;
    private String third_order_no;
    private String carNo;
    private String mall_id;
    private String member_id;

    public String getTransaction_no() {
        return transaction_no;
    }

    public void setTransaction_no(String transaction_no) {
        this.transaction_no = transaction_no;
    }

    public String getPay_order_no() {
        return pay_order_no;
    }

    public void setPay_order_no(String pay_order_no) {
        this.pay_order_no = pay_order_no;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getThird_order_no() {
        return third_order_no;
    }

    public void setThird_order_no(String third_order_no) {
        this.third_order_no = third_order_no;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getMall_id() {
        return mall_id;
    }

    public void setMall_id(String mall_id) {
        this.mall_id = mall_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PayUploadVo{");
        sb.append("transaction_no='").append(transaction_no).append('\'');
        sb.append(", pay_order_no='").append(pay_order_no).append('\'');
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", third_order_no='").append(third_order_no).append('\'');
        sb.append(", carNo='").append(carNo).append('\'');
        sb.append(", mall_id='").append(mall_id).append('\'');
        sb.append(", member_id='").append(member_id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
