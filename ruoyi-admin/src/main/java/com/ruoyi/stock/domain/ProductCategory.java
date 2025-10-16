package com.ruoyi.stock.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

@Data
@TableName("product_category")
public class ProductCategory extends BaseEntity {
    @TableId
    private Long categoryId;       // 分类ID
    private String categoryName;   // 分类名称
    private String categoryCode;   // （HUAWEI/NVIDIA）
    private String status;         // 状分类标识态（0正常 1停用）
}