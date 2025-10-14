package com.ruoyi.stock.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.stock.domain.ProductStockIn;
import com.ruoyi.stock.dto.StockInDTO;

import java.util.List;


public interface IProductStockInService {

    /**
     * 扫码入库
     */
    void scanSave(StockInDTO dto);

    /**
     * 根据商品编码查询历史入库记录
     */
    List<ProductStockIn> getProductHistory(String productCode);

    /**
     * 根据商品编码查询最近一次入库信息
     */
    ProductStockIn getLastProductInfo(String productCode);
}