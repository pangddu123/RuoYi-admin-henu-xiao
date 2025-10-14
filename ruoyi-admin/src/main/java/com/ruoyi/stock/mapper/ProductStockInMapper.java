package com.ruoyi.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.stock.domain.ProductStockIn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductStockInMapper extends BaseMapper<ProductStockIn> {
    /**
     * 插入入库记录
     */
    int insertStockIn(ProductStockIn stockIn);

    /**
     * 根据商品编码查询入库记录
     */
    List<ProductStockIn> selectByProductCode(String productCode);

    /**
     * 根据商品编码查询最近一次入库记录
     */
    ProductStockIn selectLastByProductCode(String productCode);
}