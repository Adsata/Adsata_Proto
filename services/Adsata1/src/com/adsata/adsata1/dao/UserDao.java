/*Copyright (c) 2019-2020 adsata.com All Rights Reserved. This software is the confidential and proprietary information of adsata.com. You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with adsata.com*/
package com.adsata.adsata1.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import com.wavemaker.runtime.data.dao.query.types.wmql.WMQLTypeHelper;

import com.adsata.adsata1.User;

/**
 * Specifies methods used to obtain and modify User related information
 * which is stored in the database.
 */
@Repository("Adsata1.UserDao")
public class UserDao extends WMGenericDaoImpl<User, Integer> {

    @Autowired
    @Qualifier("Adsata1Template")
    private HibernateTemplate template;

    @Autowired
    @Qualifier("Adsata1WMQLTypeHelper")
    private WMQLTypeHelper wmqlTypeHelper;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }

    @Override
    public WMQLTypeHelper getWMQLTypeHelper() {
        return this.wmqlTypeHelper;
    }

}