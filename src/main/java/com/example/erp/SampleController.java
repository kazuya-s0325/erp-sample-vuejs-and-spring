package com.example.erp;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {
  @PostMapping("/sample")
  public ResultObject post(@RequestBody SampleForm sampleForm) {
    int id = sampleForm.getId();
    ResultObject resultObject = new ResultObject();
    resultObject.setName("中野四葉");
    resultObject.setRank(id);
    return resultObject;
  }
}
