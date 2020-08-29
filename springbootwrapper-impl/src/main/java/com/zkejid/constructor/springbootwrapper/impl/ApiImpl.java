package com.zkejid.constructor.springbootwrapper.impl;

import com.zkejid.constructor.core.api.v1.EntryPoint;
import com.zkejid.constructor.springbootwrapper.api.v1.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class ApiImpl implements Api, EntryPoint {

  @Override
  public void main(String[] args) {
    SpringApplication.run(ApiImpl.class, args);
  }
}
