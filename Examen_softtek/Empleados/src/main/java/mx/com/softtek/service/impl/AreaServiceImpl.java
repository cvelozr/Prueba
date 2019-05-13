package mx.com.softtek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mx.com.softtek.dao.AreaDAO;
import mx.com.softtek.entity.Area;
import mx.com.softtek.service.AreaService;

@Service("AreaService")
@Scope
public class AreaServiceImpl implements AreaService{

	@Autowired
	AreaDAO areaDao;
	@Override
	public List<Area> obtenerAreas() {
		return areaDao.obtenerAreas();
	}

}
