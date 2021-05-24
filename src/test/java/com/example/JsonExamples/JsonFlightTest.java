package com.example.JsonExamples;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@WebMvcTest(JsonFlight.class)
public class JsonFlightTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getFlight() throws Exception{
        RequestBuilder request=get("/flights/flight")
                .contentType(MediaType.APPLICATION_JSON);

        this.mvc.perform(request).andExpect(status().isOk())
                //.andExpect(jsonPath("$.departs", is("2017-04-21 14:34")))
                .andExpect(jsonPath("$.tickets[0].passengers[0].firstName",is ("Madhavi")))
                .andExpect(jsonPath("$.tickets[0].passengers[0].lastName",is ("Yerukala")))
                .andExpect(jsonPath("$.tickets[0].price",is (200)));

    }

}
