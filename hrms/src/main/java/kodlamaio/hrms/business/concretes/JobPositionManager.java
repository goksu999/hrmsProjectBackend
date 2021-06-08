package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.City;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
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
