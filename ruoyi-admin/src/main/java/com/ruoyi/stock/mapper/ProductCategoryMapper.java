package com.ruoyi.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.stock.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    /**
     * 查询所有有效的商品分类
     */
    List<ProductCategory> selectList(ProductCategory category);

    /**
     * 根据分类编码查询
     */
    ProductCategory selectByCategoryCode(String categoryCode);
}