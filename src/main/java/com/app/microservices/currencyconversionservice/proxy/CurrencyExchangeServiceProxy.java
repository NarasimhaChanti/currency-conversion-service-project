package com.app.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.microservices.currencyconversionservice.bean.CurrencyConversion;


//@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-Zuul-Api-Gateway-Server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	/*@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
*/
	
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);

		
}
