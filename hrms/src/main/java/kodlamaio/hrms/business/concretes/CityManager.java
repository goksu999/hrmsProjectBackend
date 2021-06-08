package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<City> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<City>> getByNameContains(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
