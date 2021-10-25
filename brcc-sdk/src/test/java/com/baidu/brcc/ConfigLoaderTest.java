package com.baidu.brcc;
import com.baidu.brcc.model.AuthVo;
import com.baidu.brcc.model.R;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.baidu.brcc.utils.HttpClient;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySources;
import org.springframework.util.PropertiesPersister;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoaderTest {
    @Mock
    Logger LOGGER;
    @Mock
    HttpClient httpClient;
    @Mock
    Environment environment;
    @Mock
    ApplicationContext applicationContext;
    @Mock
    Properties ccLoadedProps;
    @Mock
    Properties cachedProps;
    @Mock
    Properties rccProperties;
    @Mock
    MutablePropertySources propertySources;
    @Mock
    PropertySources appliedPropertySources;
    @Mock
    BeanFactory beanFactory;
    @Mock
    Log logger;
    @Mock
    PropertiesPersister propertiesPersister;
    @Mock
    private ConfigLoader configLoader;





    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLogin() throws Exception {
        String authUrl = "abc";
        R<AuthVo> vo = null;
        vo = httpClient.postJson(anyString(), any(), any(), anyMap(), anyMap());
        String res = configLoader.login();
        Assert.assertEquals(null, res);






    }



}
