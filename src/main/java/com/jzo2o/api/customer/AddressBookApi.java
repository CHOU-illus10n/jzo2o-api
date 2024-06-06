package com.jzo2o.api.customer;

import com.jzo2o.api.customer.dto.response.AddressBookResDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zwy
 * @version 1.0
 * @description: TODO
 * @date 2024/5/12 14:47
 */
//value 微服务名字
@FeignClient(contextId = "jzo2o-customer", value = "jzo2o-customer", path = "/customer/inner/address-book")
public interface AddressBookApi {
    @GetMapping("/{id}")
    AddressBookResDTO detail(@PathVariable("id") Long id);
    
}
