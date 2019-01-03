package com.cloud.sample.model;

import lombok.Data;

/**
 * @Auther: zhiwei
 * @Date: 2019/1/2 17:51
 * @Description:
 */
@Data
public class Order {

    private Integer orderId;
    private Integer userId;
    private String status;

}
