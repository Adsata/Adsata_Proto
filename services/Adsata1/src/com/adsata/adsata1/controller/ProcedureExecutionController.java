/*Copyright (c) 2019-2020 adsata.com All Rights Reserved. This software is the confidential and proprietary information of adsata.com. You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with adsata.com*/
package com.adsata.adsata1.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

import com.adsata.adsata1.service.Adsata1ProcedureExecutorService;

@RestController(value = "Adsata1.ProcedureExecutionController")
@RequestMapping("/Adsata1/procedureExecutor")
@Api(value = "ProcedureExecutionController", description = "controller class for procedure execution")
public class ProcedureExecutionController {


    @Autowired
    private Adsata1ProcedureExecutorService procedureService;


}