package com.zzc;

import com.zzc.mapper.EstateMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class HouseRentApplicationTests {
    @Autowired
    EstateMapper estateMapper;

    @Test
    void contextLoads() {
        System.out.println(estateMapper.cityCountEstate()
        );

    }

}
