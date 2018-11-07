package com.org.aop.dao;

import com.org.aop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KaBu on 2018/11/6.
 */
public interface IProductDao extends JpaRepository<Product,Long>{

    public Product findProductById(Long id);
}
