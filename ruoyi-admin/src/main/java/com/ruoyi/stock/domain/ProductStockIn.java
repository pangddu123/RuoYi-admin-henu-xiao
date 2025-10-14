package com.ruoyi.stock.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
@TableName("product_stock_in")
public class ProductStockIn extends BaseEntity {
    @TableId
    private Long id;
    private String productCode;     // 商品编码
    private String productName;    // 商品名称
    private String category;       // 商品分类
    private String warehouse;      // 入库仓库
    private String remark;         // 入库备注
    private Date createTime;       // 创建时间
    private String createBy;       // 创建人
}