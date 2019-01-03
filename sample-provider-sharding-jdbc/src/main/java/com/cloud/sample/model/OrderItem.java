package com.cloud.sample.model;

import lombok.Data;

/**
 * @Auther: zhiwei
 * @Date: 2019/1/2 17:53
 * @Description:
 */
@Data
public class OrderItem {

    private Integer orderId;
    private Integer itemId;
    private String status;
    private Integer userId;

}
