package com.dingding.cdc.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RecordMapperTest {

    @Resource
    private RecordMapper recordMapper;

    @Test
    public void getAll() {
        System.out.println(recordMapper.getAll());
    }
}