package com.biblioteca.aulas.biblioteca_aulas.voluntario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VoluntarioApplicationTests {

    @Autowired
    private VoluntarioService voluntarioService;

    @Test
    void getAllVoluntarios() {
        List<Voluntario> listVoluntario = voluntarioService.getAll();
        assertEquals(listVoluntario.isEmpty(), false);
    }

    @Test
    public void givenAllVoluntario_return_status_200() throws ClientProtocolException, IOException {
        
        HttpUriRequest request = new HttpGet( "http://localhost:8080/voluntario/getAll");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        assertEquals(httpResponse.getStatusLine().getStatusCode(),HttpStatus.SC_OK);

    }

    
}