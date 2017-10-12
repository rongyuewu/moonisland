package cn.com.yld.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.yld.pojo.Address;
import cn.com.yld.pojo.Brand;
import cn.com.yld.service.AddressService;

@Controller
@RequestMapping(value="/address")
public class AddressAction {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/address")
	@ResponseBody
	public List<Address> f2(){
		List<Address> list=addressService.findall();
		return list;
	}
	@RequestMapping(value="/addaddress")
	@ResponseBody
	public int f4(Address address){
		return addressService.insert(address);
	}
	@RequestMapping(value="/deladdress")
	@ResponseBody
	public void f5(Address address){
		addressService.delect(address);
	}
}
