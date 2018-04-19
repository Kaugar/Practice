package com.greenfoxacademy.warehouse.controllers;

import com.greenfoxacademy.warehouse.WarehouseApplication;
import com.greenfoxacademy.warehouse.models.Warehouse;
import com.greenfoxacademy.warehouse.repositories.WarehouseRepo;
import com.sun.tools.javac.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyFloat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WarehouseApplication.class)
@WebAppConfiguration
@EnableWebMvc
@AutoConfigureMockMvc

public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;


  @Autowired
  private WebApplicationContext webApplicationContext;

  @Test
  public void jsonResponseTest() throws Exception {
    mockMvc
            .perform(get("/warehouse/query")
                    .contentType(MediaType.APPLICATION_JSON)
                    .param("price","50")
                    .param("type","lower"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.clothes[1].category").value("skirts"));
  }
  @Test
  public void jsonResponseTest2() throws Exception {
    mockMvc
            .perform(get("/warehouse/query")
                    .contentType(MediaType.APPLICATION_JSON)
                    .param("price","50")
                    .param("type","lower"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.clothes[1].unitPrice").value(39));
  }

}