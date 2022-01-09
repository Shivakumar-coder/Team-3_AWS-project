package com.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.dto.Jewellery;
import com.th.entity.JewelleryDB;
import com.th.repositories.JewelleryRepository;

@Service(value = "jewelleryService")
@Transactional
public class JewelleryServiceImpl implements JewelleryService{
	
	@Autowired
	private JewelleryRepository jewelleryRepository;

	@Override
	public Integer addJewellery(Jewellery jewellery) {
		JewelleryDB jewel=new JewelleryDB();
		jewel.setJewelType(jewellery.getJewelType());
		jewel.setMetal(jewellery.getMetal());
		jewel.setWeight(jewellery.getWeight());
		jewel.setPrice(jewellery.getPrice());
		
		jewelleryRepository.save(jewel);
		return jewel.getJewelId();
	}
	
	
	
}
