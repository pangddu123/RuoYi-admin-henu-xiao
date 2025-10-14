package com.ruoyi.stock.service.impl;

import com.ruoyi.stock.domain.ProductStockIn;
import com.ruoyi.stock.dto.StockInDTO;
import com.ruoyi.stock.mapper.ProductCategoryMapper;
import com.ruoyi.stock.mapper.ProductStockInMapper;
import com.ruoyi.stock.service.IProductStockInService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductStockInServiceImpl implements IProductStockInService {

    private final ProductStockInMapper stockInMapper;
    private final ProductCategoryMapper categoryMapper;

    @Override
    @Transactional
    public void scanSave(StockInDTO dto) {
        // 这里可以根据需要添加业务逻辑，比如验证分类是否存在等
        // 例如：验证分类是否有效
        // ProductCategory category = categoryMapper.selectByCategoryCode(dto.getCategory());
        // if (category == null) {
        //     throw new RuntimeException("商品分类不存在");
        // }

        // 创建入库记录实体
        ProductStockIn stockIn = new ProductStockIn();
        stockIn.setProductCode(dto.getProductCode());
        stockIn.setProductName(dto.getProductName());
        stockIn.setCategory(dto.getCategory());
        stockIn.setWarehouse(dto.getWarehouse());
        stockIn.setRemark(dto.getRemark());
        stockIn.setCreateTime(new Date());
        stockIn.setCreateBy("system"); // 这里应该从登录用户信息中获取

        // 保存入库记录
        stockInMapper.insertStockIn(stockIn);
    }

    @Override
    public List<ProductStockIn> getProductHistory(String productCode) {
        return stockInMapper.selectByProductCode(productCode);
    }

    @Override
    public ProductStockIn getLastProductInfo(String productCode) {
        return stockInMapper.selectLastByProductCode(productCode);
    }
}