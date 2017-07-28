package com.jason.service.impl;

import com.jason.dao.SkuDao;
import com.jason.domain.Sku;
import com.jason.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jasoncc on 26/07/17.
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    SkuDao skuDao;

    @Override
    public List<Sku> getAll() {
       return skuDao.getAll();
    }
}
