package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import javax.sql.rowset.CachedRowSet;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
