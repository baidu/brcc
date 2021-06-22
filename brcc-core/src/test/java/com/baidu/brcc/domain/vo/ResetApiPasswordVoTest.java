package com.baidu.brcc.domain.vo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ResetApiPasswordVoTest {
    @InjectMocks
    ResetApiPasswordVo resetApiPasswordVo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetId() throws Exception{
        resetApiPasswordVo.setId(Long.valueOf(1));
    }

    @Test
    public void testSetApiPassword() throws Exception{
        resetApiPasswordVo.setApiPassword("pws");
    }
}
