package com.ruoyi.stock.controller;

import com.ruoyi.stock.domain.ProductStockIn;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.stock.dto.StockInDTO;
import com.ruoyi.stock.service.IProductStockInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/stock/in")
public class ProductStockInController {

    @Autowired
    private IProductStockInService stockInService;


    @PostMapping("/scanSave")
    public AjaxResult scanSave(@Valid @RequestBody StockInDTO dto) {
        stockInService.scanSave(dto);
        return AjaxResult.success("入库成功");
    }



    /**
     * 根据商品编码查询历史入库信息
     */
    @GetMapping("/history/{productCode}")
    public AjaxResult getProductHistory(@PathVariable String productCode) {
        List<ProductStockIn> historyList = stockInService.getProductHistory(productCode);
        return AjaxResult.success(historyList);
    }

    /**
     * 根据商品编码查询最近一次入库信息
     */
    @GetMapping("/last/{productCode}")
    public AjaxResult getLastProductInfo(@PathVariable String productCode) {
        ProductStockIn lastRecord = stockInService.getLastProductInfo(productCode);
        return AjaxResult.success(lastRecord);
    }

}