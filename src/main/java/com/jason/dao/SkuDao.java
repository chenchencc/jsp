package com.jason.dao;

import com.jason.domain.Sku;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jasoncc on 26/07/17.
 */

public interface SkuDao {
    public List<Sku> getAll();
}
