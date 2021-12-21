package com.businessassistantbcn.opendata.helper;

import com.businessassistantbcn.opendata.SpringTestConfiguration;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.net.MalformedURLException;
import java.net.URL;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { SpringTestConfiguration.class })
public class HttpClientHelperTest {

    @Autowired
    private Environment env;

    @Test
    public void getStringRootTest() {

        try {
            URL url = new URL(env.getProperty("ds_test"));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

        @Test
        public void getJsonRootTest() {
        }

        @Test
        public void getObjectRootTest (){

        }
    }
