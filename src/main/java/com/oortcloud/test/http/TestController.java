package com.oortcloud.test.http;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TestController {

  @GetMapping
  @ResponseBody
  @ResponseStatus(code = HttpStatus.OK)
  public String getTest() {

    return "Hello World";
  }
}
