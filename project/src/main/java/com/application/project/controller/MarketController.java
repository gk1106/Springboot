package com.application.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.project.entity.Market;
import com.application.project.repo.Marketrepo;

@RestController
public class MarketController {
@Autowired
	private Marketrepo marketrepo;


@GetMapping("/hi")
public String details()
{
	return "hello this is upcoming website";
}

@PostMapping("/Market/getdetails")
public Market getdetails(Market market)
{
	
	marketrepo.save(market);
	
	return market;
}

@GetMapping("/Market/getall/{MarketId}")
public Market getdetails(@RequestParam int MarketId)
{
	Optional<Market> marketa=marketrepo.findById(MarketId);
	Market market1=marketa.get();
	return market1;
}

@GetMapping("/Market/getallD")
public List<Market> getall()
{
	List<Market> Marketlist=marketrepo.findAll();
	return Marketlist;
}

@PutMapping("/Market/update")
public Market update(@RequestBody Market market)
{
	marketrepo.save(market);
	
	return market;
}

@DeleteMapping("/Market/deleteId/{MarketId}")
public String delete(@PathVariable int MarketId)
{
Market	market=marketrepo.findById(MarketId).get();
	
	if(market != null)
	
		marketrepo.delete(market);
	return "deleted sucessfully";
	
	
}



}
