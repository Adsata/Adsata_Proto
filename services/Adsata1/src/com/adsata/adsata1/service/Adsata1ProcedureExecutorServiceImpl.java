/*Copyright (c) 2019-2020 adsata.com All Rights Reserved. This software is the confidential and proprietary information of adsata.com. You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with adsata.com*/
package com.adsata.adsata1.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class Adsata1ProcedureExecutorServiceImpl implements Adsata1ProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Adsata1ProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("Adsata1WMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}